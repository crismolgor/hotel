/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.util.Date;
/**
 *
 * @author USUARI0
 */
import java.util.Date;

public class Alquiler {
    private int id;
    private int cantidad;
    private Date fecha;
    private Usuario usuario;
    private Tipohabitacion habitacion;

    // Constructor
    public Alquiler(int id, int cantidad, Date fecha, Usuario usuario, Tipohabitacion habitacion) {
        this.id = id;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.usuario = usuario;
        this.habitacion = habitacion;
    }

    // Métodos getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Tipohabitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Tipohabitacion habitacion) {
        this.habitacion = habitacion;
    }
}

