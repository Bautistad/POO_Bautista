package Control;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author Usuario
 */
public class Conexion {
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String user="root";
    private static final String pass="";
    private static final String url="jdbc:mysql://localhost:3306/lab2eva2"; 
    
    Connection conectar = null;
    
    public  Connection conexion(){
        
        try{
            Class.forName(driver);
            conectar=(Connection) DriverManager.getConnection(url,user,pass);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"error de conexion "+e.getMessage());
        }
        return conectar;
    }
}
