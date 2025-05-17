
package Negocio;
import Config.Conexion;
import java.sql.*;
import Entidad.*;
import java.util.Date;

public class clsNFuncion {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs; //almaceba datos en la consulta
    Statement st;

    public boolean mtdGuardarFuncion(int idEmpleado, String descripcion, Date inicioContratacion, int salario) {
        String sql = "{ CALL Delegar_Funcion(?, ?, ?, ?) }"; // Consulta para llamar al procedimiento almacenado
        Connection con = null;
        PreparedStatement ps = null;

        try {
            // Obtener la conexión a la base de datos
            con = cn.getConnection();
            ps = con.prepareStatement(sql);

            // Asignar valores a los parámetros
            ps.setInt(1, idEmpleado);
            ps.setString(2, descripcion);
            ps.setDate(3, new java.sql.Date(inicioContratacion.getTime())); // Convertir Date a java.sql.Date
            ps.setInt(4, salario);

            // Ejecutar la consulta
            int resultado = ps.executeUpdate();
            return resultado > 0; // Si se inserta al menos una fila, retorna true
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

    public ResultSet mtdListarFuncion() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        String sql = "SELECT f.* " +
                     "FROM tbfuncion f " +
                     "JOIN tbempleado e ON f.id_empleado = e.id_empleado " +
                     "WHERE e.cargo = 'Trabajador'";
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
public boolean mtdEditarFuncion(clsEFuncion objEF) {
    String sql = "UPDATE tbfuncion SET fin_contratacion = ?, salario = ?, estado = ?, descripcion = ? WHERE id_funcion = ?";
    Connection con = null;
    PreparedStatement ps = null;

    try {
        con = cn.getConnection();
        ps = con.prepareStatement(sql);

        // Asignar valores a los parámetros
        if (objEF.getFin_contratacion() != null) {
            ps.setString(1, objEF.getFin_contratacion());
        } else {
            ps.setNull(1, Types.DATE); // Si fin_contratacion es null, asignar valor nulo al parámetro SQL
        }
        ps.setInt(2, objEF.getSalario());
        ps.setString(3, objEF.getEstado());
        ps.setString(4, objEF.getDescripcion());
        ps.setInt(5, objEF.getId_funcion());

        // Ejecutar la consulta
        int resultado = ps.executeUpdate();
        return resultado > 0; // Si se actualiza al menos una fila, retorna true
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

}
