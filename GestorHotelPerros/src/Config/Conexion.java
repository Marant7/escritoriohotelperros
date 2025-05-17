
package Config;

import java.sql.*;

public class Conexion {
    
    Connection con = null;
    
    public Conexion (){
        try{
           Class.forName("com.mysql.jdbc.Driver");
           //driver conexion a mysql
           
           con=DriverManager.getConnection("jdbc:mysql://161.132.56.56:3306/dbhotelparaperros", "sa", "" );
           // conexion a la BD con los parametros de la conexion 
        }
        catch(ClassNotFoundException | SQLException e)
        {
            
        }
    }
    
    public Connection getConnection (){
        return con;
    }
        
}
