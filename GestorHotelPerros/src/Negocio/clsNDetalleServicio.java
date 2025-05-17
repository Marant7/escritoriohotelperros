package Negocio;
import Entidad.*;
import java.sql.*;
import Config.Conexion;

public class clsNDetalleServicio {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs; //almaceba datos en la consulta
    Statement st;  

    public ResultSet mtdListaArticulos() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        String sql = "SELECT id_articulo, nombre, descripcion, precio_unitario FROM tbarticulo";
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

    public ResultSet obtenerServicios() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        String sql = "SELECT id_servicio, descripcion FROM tbservicios";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            return rs;
        } catch (SQLException e) {
            System.out.println("Error al obtener servicios: " + e.toString());
        }
        return null;  // Devolver null en caso de error    
    }

    public boolean mtdGuardarDetalleServicio(clsEDetalleServicio objEDS) {
        String sql = "INSERT INTO tbdetalle_servicios (id_servicio, id_articulo, cantidad) VALUES (?, ?, ?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);

            // Setear los parámetros del PreparedStatement
            ps.setInt(1, objEDS.getId_servicio());
            ps.setInt(2, objEDS.getId_articulo());
            ps.setInt(3, objEDS.getCantidad());

            // Ejecutar la consulta
            int resultado = ps.executeUpdate();

            // Verificar si se realizó la inserción correctamente
            if (resultado > 0) {
                return true;  // Inserción exitosa
            } else {
                return false;  // Fallo en la inserción
            }
        } catch (SQLException e) {
            System.out.println("Error al guardar detalle de servicio: " + e.toString());
            return false;
        } finally {
            // Cerrar recursos
            try {
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar conexión: " + e.toString());
            }
        }
    }

    public ResultSet mtdListarDetalleServicio() {
        // Define la consulta SQL con INNER JOIN
        String sql = "SELECT ds.id_detalle_servicio, ds.id_servicio, ds.id_articulo, ds.cantidad, s.descripcion " +
                     "FROM tbdetalle_servicios ds " +
                     "INNER JOIN tbservicios s ON ds.id_servicio = s.id_servicio";
        try {
            // Establece la conexión y prepara la sentencia
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            // Retorna el ResultSet con los resultados
            return rs;
        } catch (SQLException e) {
            // Manejo de errores y muestra el mensaje de error
            System.out.println("Error: " + e.toString());
        }
        // Retorna el ResultSet aunque haya ocurrido un error
        return rs;
    }

    public boolean mtdEditarDetalleServicio(clsEDetalleServicio objEDS) {
        String sql = "UPDATE tbdetalle_servicios SET id_servicio = ?, id_articulo = ?, cantidad = ? WHERE id_detalle_servicio = ?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);

            // Setear los parámetros del PreparedStatement
            System.out.println("Editando detalle de servicio con id: " + objEDS.getId_detalle_servicio());
            ps.setInt(1, objEDS.getId_servicio());
            ps.setInt(2, objEDS.getId_articulo());
            ps.setInt(3, objEDS.getCantidad());
            ps.setInt(4, objEDS.getId_detalle_servicio());

            // Ejecutar la consulta
            int resultado = ps.executeUpdate();

            // Verificar si se realizó la actualización correctamente
            return resultado > 0;  // Si se actualizó al menos una fila, retornar true
        } catch (SQLException e) {
            System.out.println("Error al editar detalle de servicio: " + e.toString());
            return false;
        } finally {
            // Cerrar recursos
            try {
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar conexión: " + e.toString());
            }
        }
    }    
}
