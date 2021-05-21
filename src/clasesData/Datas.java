/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesData;

import clasesEntidad.Usuario;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Hernan14
 */
public class Datas {
    private Connection con;
    
    public Datas(Conexion con){
        this.con = con.conectar();
    }
    
    public Datas(){}
    
    public Usuario buscarUsuario(String dni){
        Usuario usu = null;
        String sql = ("SELECT * FROM usuario WHERE dni=?");
        
        try{
            PreparedStatement ps= con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, dni);
            
            ResultSet rs = ps.executeQuery();
 
            if(rs.next()){
                usu = new Usuario();
                usu.setDni(rs.getString("dni"));
                usu.setApellido(rs.getString("apellido"));
                usu.setFechaEntrada(rs.getDate("fechaEntrada").toLocalDate());
                usu.setMail(rs.getString("mail"));
                usu.setNombre(rs.getString("nombre"));
                usu.setPassword(rs.getString("password"));

            }else{
                JOptionPane.showMessageDialog(null, "No se pudo encontrar usuario");
            }

        }catch(SQLException e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "No se pudo buscar usuario");
        }
        return usu;
    }
}
    

