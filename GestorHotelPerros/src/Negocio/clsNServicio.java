/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import Config.Conexion;
import Entidad.*;
import java.sql.*;

public class clsNServicio {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs; //almaceba datos en la consulta
    Statement st;
    
    
    public boolean mtdGuardarServicio(clsEServicio objAl) {
    String SQL = "INSERT INTO tbservicios (descripcion,precio) "
               + "VALUES (?, ?)";

    try {
        con = cn.getConnection();
        ps = con.prepareStatement(SQL);
        ps.setString(1, objAl.getDescripcion());
        ps.setFloat(2, objAl.getCantidad());
        
        int rowsAffected = ps.executeUpdate();
        return rowsAffected > 0;

    } catch (SQLException e) {
        System.out.println("Error: " + e.toString());
        return false;
    }
}
    public boolean mtdActualizarServicio(clsEServicio objAl) {
        
    String SQL ="UPDATE tbservicios SET "
            +"id_servicio= '"+ objAl.getId_servicio() + "',"
            +"descripcion = '"+ objAl.getDescripcion()+"',"
            +"precio = '" +objAl.getCantidad()+"'"
            +" where id_servicio = '"+objAl.getId_servicio()+"'";

    System.out.println("sentencia"+SQL);
    
    try {
        con = (Connection) cn.getConnection();
        st=con.createStatement();
        st.executeUpdate(SQL);
        return true;
        
    } catch (SQLException e){
        System.out.println("error"+e.toString());
        return false;
    }
    }
    public ResultSet mtdListarArticulo() {
        
        ResultSet rs = null;
	String sql = "SELECT * FROM tbservicios;"; 
        try{
            con=(Connection) cn.getConnection();
            ps=con.prepareStatement(sql); 
            rs = ps.executeQuery(); 
            return rs; 
            
        } catch(SQLException e ){
        
            System.out.println("error"+e.toString());
        }
        return rs;
    }
    
    public ResultSet mtdBuscarArticulo(clsEServicio objEA) {
    ResultSet rs = null;
    String sql = "SELECT * FROM tbservicios WHERE id_servicio = ?";
    System.out.println("Sentencia SQL: " + sql);

    try {
        con = (Connection) cn.getConnection();
        ps = con.prepareStatement(sql);
        ps.setInt(1, objEA.getId_servicio());
        rs = ps.executeQuery(); 
    } catch (SQLException e) {
        System.out.println("Error al buscar artículo: " + e.toString());
    }

    return rs;
    }
      
}
