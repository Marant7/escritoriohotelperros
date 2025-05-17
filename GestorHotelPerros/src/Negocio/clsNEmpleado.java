
package Negocio;
import Config.Conexion;
import Entidad.*;
import java.sql.*;

public class clsNEmpleado {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs; //almaceba datos en la consulta
    Statement st;

    public boolean validarLogin(clsEEmpleado objEE) {
      String usuario = objEE.getUsuario();
      String clave = objEE.getClave();
      return usuario.equals("admin") && clave.equals("admin");
    }

    public boolean mtdGuardarEmpleado(clsEEmpleado objEE) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        String sql = "INSERT INTO tbempleado (nombre, apellido, telefono,genero, direccion, correo,usuario) " +
                     "VALUES (?, ?, ?, ?, ?, ?,?)";
        
        try {
            con = cn.getConnection(); // Obtener la conexión a la base de datos desde la clase Conexion
            ps = con.prepareStatement(sql);
            ps.setString(1, objEE.getNombre());
            ps.setString(2, objEE.getApellido());
            ps.setString(3, objEE.getTelefono());
            ps.setString(4, objEE.getGenero());
            ps.setString(5, objEE.getDireccion());
            ps.setString(6, objEE.getCorreo());
            ps.setString(7, objEE.getUsuario());

            int resultado = ps.executeUpdate();
            return resultado > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public ResultSet mtdListarEmpleado() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        String sql = "SELECT id_empleado, nombre, apellido, telefono, genero, direccion, correo, usuario FROM tbempleado where cargo = 'Trabajador' ";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            return rs;
        } catch (SQLException e) {
            System.out.println("Error: " + e.toString());
        }
        return rs;
    }

    public boolean mtdEditarEmpleado(clsEEmpleado objEE) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        String sql = "UPDATE tbempleado SET nombre = ?, apellido = ?, telefono = ?, genero = ?, direccion = ?, correo = ?, usuario = ? WHERE id_empleado = ?";
    
        try {
            con = cn.getConnection(); // Obtener la conexión a la base de datos
            ps = con.prepareStatement(sql);
            ps.setString(1, objEE.getNombre());
            ps.setString(2, objEE.getApellido());
            ps.setString(3, objEE.getTelefono());
            ps.setString(4, objEE.getGenero());
            ps.setString(5, objEE.getDireccion());
            ps.setString(6, objEE.getCorreo());
            ps.setString(7, objEE.getUsuario());
            ps.setInt(8, objEE.getId_empleado()); // Aquí se usa el ID del empleado para actualizar el registro correcto

            int resultado = ps.executeUpdate();
            return resultado > 0; // Devuelve true si la actualización fue exitosa
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        }   

    public ResultSet mtdListarEmpleadoSinFuncion() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        String sql = "SELECT id_empleado, nombre, apellido, telefono, genero, direccion, correo " +
             "FROM tbempleado " +
             "WHERE id_empleado NOT IN (SELECT id_empleado FROM tbfuncion) " +
             "AND cargo = 'Trabajador'"; // Añadir esta línea para filtrar por el cargo
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            return rs;
        } catch (SQLException e) {
            System.out.println("Error: " + e.toString());
        }
        return rs;
    }    
}
