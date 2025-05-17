
package Negocio;

import Config.Conexion;
import Entidad.*;
import java.sql.*;

public class clsNKardex {
    
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs; //almaceba datos en la consulta
    Statement st;
    
    public boolean mtdGuardarKardex(clsEKardex objAl) {
    String SQL = "INSERT INTO tbkardex (id_inventario, id_empleado, tipo_movimiento, comentarios, fecha, cantidad) "
               + "VALUES (?, ?, ?, ?, NOW(), ?)";

    try {
        con = cn.getConnection();
        ps = con.prepareStatement(SQL);
        ps.setInt(1, objAl.getId_inventario());
        ps.setInt(2, objAl.getId_empleado());
        ps.setString(3, objAl.getTipo_movimiento());
        ps.setString(4, objAl.getComentario());
        ps.setFloat(5, objAl.getCantidad());
        
        int rowsAffected = ps.executeUpdate();
        return rowsAffected > 0;

    } catch (SQLException e) {
        System.out.println("Error al ejecutar la consulta SQL: " + e.toString());
        return false;
    } finally {
        try {
            if (ps != null) {
                ps.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            System.out.println("Error al cerrar la conexión: " + ex.toString());
        }
    }
}

    public ResultSet mtdListarKardex() {
        ResultSet rs = null;
        String sql = "SELECT * FROM tbkardex"; // Consulta SQL para seleccionar todos los registros de tbkardex

        try {
            con = (Connection) cn.getConnection(); // Obtener la conexión a la base de datos
            ps = con.prepareStatement(sql); // Preparar la declaración SQL
            rs = ps.executeQuery(); // Ejecutar la consulta y almacenar el resultado en el ResultSet
            return rs; // Devolver el ResultSet con los datos obtenidos
        } catch (SQLException e) {
            System.out.println("Error al ejecutar consulta SQL: " + e.toString());
            // Aquí podrías lanzar una excepción personalizada o manejar el error de otra forma
        }
        // Es importante devolver rs aunque sea null en caso de error para evitar NullPointerException
        return rs; 
    }

    
    public ResultSet mtdBuscarkardex(clsEKardex objEA) {
    ResultSet rs = null;
    String sql = "SELECT * FROM tbkardex WHERE fecha LIKE ?";
    System.out.println("Sentencia SQL: " + sql);

    try {
        con = (Connection) cn.getConnection();
        ps = con.prepareStatement(sql);
        ps.setString(1, objEA.getFecha() + "%"); // Asume que getFecha() devuelve la fecha en formato "YYYY-MM-DD"
        rs = ps.executeQuery();
    } catch (SQLException e) {
        System.out.println("Error al buscar artículo: " + e.toString());
    }

    return rs;
}


}
