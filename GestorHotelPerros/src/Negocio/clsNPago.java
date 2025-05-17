
package Negocio;
import Config.Conexion;
import Entidad.clsEPago;
import java.sql.*;
import java.sql.Timestamp;

public class clsNPago {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs; //almaceba datos en la consulta
    Statement st; 

    public int obtenerIdReservaPorCodigoTicket(int codigoTicket) {
        int idReserva = -1; // Valor por defecto si no se encuentra la reserva
        
        String sql = "SELECT id_reserva FROM tbreserva WHERE codigo_ticket = ?";
        
        try {
            con = cn.getConnection(); // Obtener la conexión a la base de datos
            ps = con.prepareStatement(sql);
            ps.setInt(1, codigoTicket);
            rs = ps.executeQuery();
            
            if (rs.next()) {
                idReserva = rs.getInt("id_reserva");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        return idReserva;
    }  



public boolean mtdRegistrarPago(clsEPago objEP) {
    String SQL = "{CALL registrar_pago_y_actualizar_reserva (?, ?, NOW(), ?)}";

    try {
        con = cn.getConnection();
        ps = con.prepareStatement(SQL);
        ps.setInt(1, objEP.getId_empleado());
        ps.setInt(2, objEP.getId_reserva());
        ps.setDouble(3, objEP.getMonto()); // Corregido el índice a 3

        int rowsAffected = ps.executeUpdate();
        return rowsAffected > 0;

    } catch (SQLException e) {
        System.out.println("Error: " + e.toString());
        return false;
    }
}



    public int obtenerMontoTotalPorCodigoTicket(int codigoTicket) {
        int montoTotal = -1; // Default value if the reservation is not found

        String sql = "SELECT dr.monto_total_reserva FROM tbreserva r JOIN tbdetalle_reserva dr ON r.id_detalle_reserva = dr.id_detalle_reserva WHERE r.codigo_ticket = ?";

        try {
            con = cn.getConnection(); // Obtain the database connection
            ps = con.prepareStatement(sql);
            ps.setInt(1, codigoTicket);
            rs = ps.executeQuery();

            if (rs.next()) {
                montoTotal = rs.getInt("monto_total_reserva");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return montoTotal;
    }
}
