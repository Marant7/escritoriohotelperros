/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;


import Config.Conexion;
import Entidad.*;
import java.sql.*;

public class clsNRegistrarPago {
 
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs; //almaceba datos en la consulta
    Statement st;
    
    public ResultSet mtdBuscar(clsEReserva objRe) {
        ResultSet rs = null;
        String sql = "SELECT id_reserva, codigo_ticket, id_cliente, proceso, fecha_inicio FROM tbreserva WHERE codigo_ticket = ? AND proceso = 'pendiente'";
        System.out.println("Sentencia SQL: " + sql);

        try {
            con = cn.getConnection(); // Obtener la conexión a la base de datos
            ps = con.prepareStatement(sql);
            ps.setInt(1, objRe.getTicket()); // Establecer el parámetro en la consulta preparada
            rs = ps.executeQuery(); // Ejecutar la consulta y obtener el ResultSet
        } catch (SQLException e) {
            System.out.println("Error al ejecutar la consulta SQL: " + e.toString());
        }
        return rs; // Devolver el ResultSet con los resultados de la consulta o null si hubo un error
    }
    
    
    public ResultSet mtdBuscarTotal() {
        ResultSet rs = null;
        String sql = "SELECT id_reserva,codigo_ticket,id_cliente,proceso,fecha_inicio FROM tbreserva WHERE proceso ='pago'";
        System.out.println("Sentencia SQL: " + sql);

        try {
            con = (Connection) cn.getConnection();// Obtener la conexión a la base de datos
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery(); // Ejecutar la consulta y obtener el ResultSet
            return rs; // Devolver el ResultSet con los resultados de la consulta
        } catch (SQLException e) {
            System.out.println("Error al ejecutar la consulta SQL: " + e.toString());
        } 
        return rs; // Devolver null si hubo un error
    }
}
