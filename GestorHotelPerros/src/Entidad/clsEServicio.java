/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;


public class clsEServicio {
    private int id_servicio;
    private String descripcion;
    private Float cantidad;

    public clsEServicio() {
    }

    public clsEServicio(int id_servicio, String descripcion, Float cantidad) {
        this.id_servicio = id_servicio;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
    }

    public int getId_servicio() {
        return id_servicio;
    }

    public void setId_servicio(int id_servicio) {
        this.id_servicio = id_servicio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Float getCantidad() {
        return cantidad;
    }

    public void setCantidad(Float cantidad) {
        this.cantidad = cantidad;
    }

    
    
}
