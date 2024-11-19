/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;
import java.sql.*;
/**
 *
 * @author USUARI0
 */
public class Conexion {
   private static Connection cnx= null; 
   public static Connection obtener () throws SQLException, ClassNotFoundException{
       if (cnx  ==null)
           try {
               Class.forName("com.mysql.jdc.Driver");
               cnx = DriverManager.getConnection("jdbc:mysql://localhost/hotel","root","");
           } catch (SQLException ex){
               throw new SQLException (ex);           
           } catch (ClassNotFoundException ex ){
               throw new ClassCastException(ex.getMessage());
           }
       return null;
   }
   public static void cerrar() throws SQLException {
       if (cnx !=null){
           cnx.close();
       }
   }
}
