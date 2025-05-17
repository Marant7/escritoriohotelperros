
package Negocio;
import Config.Conexion;
import Entidad.*;
import java.sql.*;

public class clsNClienteBusqueda {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs; //almaceba datos en la consulta
    Statement st;
    
    public ResultSet mtdBuscar(clsEReserva objRe) {
        String sql = "SELECT " +
                     "c.nombre AS nombre_cliente, " +
                     "c.apellido AS apellido_cliente, " +
                     "r.codigo_ticket, " +
                     "r.fecha_inicio, " +
                     "m.tamaño AS tamaño_mascota " +
                     "FROM tbreserva r " +
                     "INNER JOIN tbcliente c ON r.id_cliente = c.id_cliente " +
                     "INNER JOIN tbdetalle_reserva d ON r.id_detalle_reserva = d.id_detalle_reserva " +
                     "INNER JOIN tbmascota m ON d.id_mascota = m.id_mascota " +
                     "WHERE r.codigo_ticket = ? and r.proceso ='pago'";
        System.out.println("Sentencia SQL: " + sql);

        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, objRe.getTicket());
            rs = ps.executeQuery();
        } catch (SQLException e) {
            System.out.println("Error al buscar artículo: " + e.toString());
        }

        return rs;
    }
}
