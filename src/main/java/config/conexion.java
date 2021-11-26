/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Fer
 */

public class conexion{
    public String driver = "com.mysql.jdbc.Driver";  
    
    //Codigo de prueba de conexion 
    public Connection getConnection(){ 
        Connection conexion = null;
        try{
         Class.forName(driver);
         
         //getConnection(direccion, usuario, pass)
         //direccion(localhost:puerto/nombre) sale de Xampp en MySQL Admin, y uso el nombre de mi DB
         conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud1111","root","");    
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println(e.toString());
        }
        return conexion;  
    }   

   public static void main(String [] args) throws SQLException{
       //TEST DE CONEXION 
       Connection connec = null;
       conexion conex = new conexion();
       connec = conex.getConnection();
      
       PreparedStatement ps;
       ResultSet rs;
       
       ps = connec.prepareStatement("SELECT * FROM alumnos");
       rs = ps.executeQuery();
       
       while(rs.next()){
           int id = rs.getInt("id");
           String nombre = rs.getString("nombre");
           String apellido = rs.getString("apellido");
           String mail = rs.getString("mail");
           
           System.out.println("id: "+id+" ; Apellido: "+apellido+" ; Nombre: "+nombre+" ; Mail: "+mail);
       }       
   }
}
