/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import Config.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



/**
 *
 * @author Fabiola
 */
public class clsNPlanilla {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    CallableStatement cs;
    ResultSet rs; //almaceba datos en la consulta
    Statement st;

    public ResultSet mtdListarPlanilla() {
        ResultSet rs = null;
        String sql = "SELECT p.id_empleado, CONCAT(e.nombre, ' ', e.apellido) AS empleado_nombre, p.id_funcion, p.fecha, p.dias, p.horas, p.salario_total " +
                     "FROM tbplanilla p " +
                     "INNER JOIN tbempleado e ON p.id_empleado = e.id_empleado";

        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
        } catch (SQLException e) {
            System.out.println("Error: " + e.toString());
        }

        return rs;
    }
    
    public boolean mtdActualizarDia(int idempleado, String fecha) {
        con = cn.getConnection();
        String sql = "{ CALL conteo_dias(?, ?) }"; // Consulta para llamar al procedimiento almacenado

        try {
            CallableStatement cs = con.prepareCall(sql);
            cs.setInt(1, idempleado);
            cs.setString(2, fecha);

            int filasAfectadas = cs.executeUpdate();
            return filasAfectadas > 0;
        } catch (SQLException e) {
            System.out.println("Error al actualizar día de salida: " + e.toString());
            return false;
        } finally {
            try {
                if (cs != null) {
                    cs.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean mtdActualizarHora(int idEmpleado, String fecha) {
        
        con = cn.getConnection();
        String sql = "{ CALL conteo_horas(?, ?) }"; // Consulta para llamar al procedimiento almacenado

        try {
            CallableStatement cs = con.prepareCall(sql);
            cs.setInt(1, idEmpleado);
            cs.setString(2, fecha);

            int filasAfectadas = cs.executeUpdate();
            return filasAfectadas > 0;
        } catch (SQLException e) {
            System.out.println("Error al actualizar día de salida: " + e.toString());
            return false;
        } finally {
            try {
                if (cs != null) {
                    cs.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
    }

    public boolean mtdActualizarSalario(int idEmpleado) {
      con = cn.getConnection();
        String sql = "{ CALL actualizar_salario(?) }"; // Consulta para llamar al procedimiento almacenado

        try {
            CallableStatement cs = con.prepareCall(sql);
            cs.setInt(1, idEmpleado);

            int filasAfectadas = cs.executeUpdate();
            return filasAfectadas > 0;
        } catch (SQLException e) {
            System.out.println("Error al actualizar día de salida: " + e.toString());
            return false;
        } finally {
            try {
                if (cs != null) {
                    cs.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }



}
