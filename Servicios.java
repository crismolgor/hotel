/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador; 
/**
 *
 * @author USUARI0
 */
import Modelo.Alquiler;
import Modelo.UsuarioServicios;
import Servicios.Conexion;
import java.sql.*;
public class Servicios {
    public void Alquiler (Alquiler alquiler){
   try{
       UsuarioServicios us = new UsuarioServicios();
       us.guardar(Conexion.obtener(), alquiler.getUsuario());           
   } catch (Exception e){}    
    }
}
