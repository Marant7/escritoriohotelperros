package Negocio;

import Config.Conexion;
import Entidad.*;
import java.sql.*;

public class clsNInventario {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public ResultSet mtdBuscarArticuloUNICO(clsEInventario objEA) {
    ResultSet rs = null;
    String sql = "SELECT i.id_inventario, i.stock, a.nombre " +
                 "FROM tbinventario i " +
                 "JOIN tbarticulo a ON i.id_articulo = a.id_articulo " +
                 "WHERE i.id_inventario = ?";
    
    System.out.println("Sentencia SQL: " + sql);

    try {
        con = cn.getConnection();
        ps = con.prepareStatement(sql);
        ps.setInt(1, objEA.getId_inventario());
        rs = ps.executeQuery();
    } catch (SQLException e) {
        System.out.println("Error al buscar artículo: " + e.toString());
    }

    return rs;
}

    public ResultSet mtdListarArticuloUNICO() {
        ResultSet rs = null;
        String sql = "SELECT i.id_inventario, i.stock, a.nombre " +
                     "FROM tbinventario i " +
                     "JOIN tbarticulo a ON i.id_articulo = a.id_articulo";

        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
        } catch (SQLException e) {
            System.out.println("Error al listar artículos: " + e.toString());
        }

        return rs;
    }
    
}

