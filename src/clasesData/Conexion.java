package clasesData;

import com.mysql.jdbc.Connection;
import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {
   private  String base="prototipoprimero";
   private  String url = "jdbc:mysql://localhost:3306/"+base;
   private  String user = "root";
   private  String pass = "";
           
    
    public Connection conectar(){
        Connection con=null;
        try{

           Class.forName("com.mysql.jdbc.Driver");

           con = (Connection) DriverManager.getConnection(this.url, this.user, this.pass);

       }catch(Exception ex){

           JOptionPane.showMessageDialog(null,"Error al conectarse"+ ex);

       }
            return con;
    }
}


