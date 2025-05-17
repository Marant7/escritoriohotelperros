
package Negocio;

import Config.Conexion;
import Entidad.*;
import java.sql.*;

public class clsNArticulo {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs; //almaceba datos en la consulta
    Statement st;
    
public boolean mtdGuardarArticulo(clsEArticulo objAl) {
    String SQL = "INSERT INTO tbarticulo (id_empleado, nombre, descripcion, fecha, precio_unitario) "
               + "VALUES (?, ?, ?, NOW(), ?)";

    try {
        con = cn.getConnection();
        ps = con.prepareStatement(SQL);
        ps.setInt(1, objAl.getId_empleado());
        ps.setString(2, objAl.getNombre());
        ps.setString(3, objAl.getDescripcion());
        ps.setFloat(4, objAl.getPrecio_unitario());
        
        int rowsAffected = ps.executeUpdate();
        return rowsAffected > 0;

    } catch (SQLException e) {
        System.out.println("Error: " + e.toString());
        return false;
    }
}

     
     public boolean mtdActualizarArticulo(clsEArticulo objAl) {
        
    String SQL ="UPDATE tbarticulo SET "
            +"id_empleado= '"+ objAl.getId_empleado() + "',"
            +"nombre='" +objAl.getNombre()+"',"
            +"descripcion = '"+ objAl.getDescripcion()+"',"
            +"fecha = NOW()," // Corrección aquí
            +"precio_unitario = '" +objAl.getPrecio_unitario()+"'"
            +" where id_articulo = '"+objAl.getId_articulo()+"'";

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
	String sql = "SELECT * FROM tbarticulo;"; 
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
      
    public ResultSet mtdBuscarArticulo(clsEArticulo objEA) {
    ResultSet rs = null;
    String sql = "SELECT * FROM tbarticulo WHERE id_articulo = ?";
    System.out.println("Sentencia SQL: " + sql);

    try {
        con = (Connection) cn.getConnection();
        ps = con.prepareStatement(sql);
        ps.setInt(1, objEA.getId_articulo());
        rs = ps.executeQuery(); 
    } catch (SQLException e) {
        System.out.println("Error al buscar artículo: " + e.toString());
    }

    return rs;
    }
}
