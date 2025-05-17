
package Negocio;

import Config.Conexion;
import Entidad.clsEEmpleado;
import Entidad.clsEAsistencia;
import java.sql.*;
import java.time.LocalTime;

/**
 *
 * @author Fabiola
 */
public class clsNAsistencia {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs; //almaceba datos en la consulta
    Statement st;

    public boolean mtdGuardarAsistencia(clsEAsistencia objEAsis, clsEEmpleado objEEmple) {
    con = cn.getConnection(); // Obtener la conexión
    CallableStatement cs = null;
    boolean resultado = false;

    try {
        // Llamar al procedimiento almacenado
        cs = con.prepareCall("{CALL registrar_asistencia(?, ?)}");
        cs.setInt(1, objEEmple.getId_empleado());
        cs.setDate(2, java.sql.Date.valueOf(objEAsis.getFecha_actual()));

        // Ejecutar el procedimiento almacenado
        cs.execute();

        resultado = true; // Si no hay excepciones, consideramos la operación exitosa

    } catch (SQLException e) {
        e.printStackTrace();
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
    return resultado;
}

    


   public ResultSet mtdListarAsistenciaporfecha(String fecha) {
        ResultSet rs = null;
        String sql = "SELECT e.id_empleado, CONCAT(e.nombre, ' ', e.apellido) AS empleado_nombre, a.hora_ingreso, a.hora_salida " +
                     "FROM tbasistencia a " +
                     "INNER JOIN tbempleado e ON a.id_empleado = e.id_empleado " +
                     "WHERE a.fecha_actual = ?";

        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, fecha); // Establecer la fecha como parámetro
            rs = ps.executeQuery();
        } catch (SQLException e) {
            System.out.println("Error: " + e.toString());
        }

        return rs;
    }


    public boolean mtdActualizarHoraSalida(int idEmpleado, String horaIngreso, LocalTime horaSalida) {
        con = cn.getConnection();
        String sql = "UPDATE tbasistencia SET hora_salida = ? WHERE id_empleado = ? AND hora_ingreso = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setTime(1, Time.valueOf(horaSalida));
            ps.setInt(2, idEmpleado);
            ps.setString(3, horaIngreso);

            int filasAfectadas = ps.executeUpdate();
            return filasAfectadas > 0;
        } catch (SQLException e) {
            System.out.println("Error al actualizar hora de salida: " + e.toString());
            return false;
        } finally {
            try {
                if (ps != null) {
                    ps.close();
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
