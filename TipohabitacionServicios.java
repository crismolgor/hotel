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
public class TipohabitacionServicios {
   public void guardar (Connection conexion, Tipohabitacion tipohabitacion) throws SQLException{
     try{
         PreparedStatement consulta;
         consulta= conexion.prepareStatement("INSERT INTO usuario (id, descipcion , tarifa , cantidad) "+ " VALUES (?, ?, ?, ?)" );
         consulta.setInt(1, tipohabitacion.getId());
         consulta.setString(2, tipohabitacion.getDescripcion());
         consulta.setInt(3, tipohabitacion.getTarifa());
         consulta.setInt(4, tipohabitacion.getCantidad());
         consulta.executeUpdate();
     } catch(SQLException ex){
         throw new SQLException(ex);
     }  
     
    } 
}
