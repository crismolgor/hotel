/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author USUARI0
 */
public class AlquilerServicios {
     public void guardar (Connection conexion, Alquiler alquiler , Usuario usuario, Tipohabitacion tipohabitacion) throws SQLException{
     try{
         PreparedStatement consulta;
         consulta= conexion.prepareStatement("INSERT INTO usuario (id, idusuario, idhabitacion , cantidad, fecha) "+ " VALUES (?, ?, ?, ?, ?)" );
         consulta.setInt(1, alquiler.getId());
         consulta.setString(2, usuario.getId());
         consulta.setInt(3, tipohabitacion.getId());
         consulta.setInt(4, alquiler.getCantidad());
         consulta.setDate(5, (java.sql.Date) alquiler.getFecha());
         consulta.executeUpdate();
     } catch(SQLException ex){
         throw new SQLException(ex);
     }  
     
    }
}
