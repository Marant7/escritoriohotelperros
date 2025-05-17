/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author RAUL
 */
public class clsEReserva {
    private int id_reserva;
    private int id_cliente;
    private int id_detalle_reserva;
    private int ticket;
    private String fecha;
    private String estado;
    private String nombre_cliente;
    private String apellido;
    private String nombre_perro;
    private String tamaño;

    public clsEReserva() {
    }

    public clsEReserva(int id_reserva, int id_cliente, int id_detalle_reserva, int ticket, String fecha, String estado, String nombre_cliente, String apellido, String nombre_perro, String tamaño) {
        this.id_reserva = id_reserva;
        this.id_cliente = id_cliente;
        this.id_detalle_reserva = id_detalle_reserva;
        this.ticket = ticket;
        this.fecha = fecha;
        this.estado = estado;
        this.nombre_cliente = nombre_cliente;
        this.apellido = apellido;
        this.nombre_perro = nombre_perro;
        this.tamaño = tamaño;
    }

    public int getId_reserva() {
        return id_reserva;
    }

    public void setId_reserva(int id_reserva) {
        this.id_reserva = id_reserva;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_detalle_reserva() {
        return id_detalle_reserva;
    }

    public void setId_detalle_reserva(int id_detalle_reserva) {
        this.id_detalle_reserva = id_detalle_reserva;
    }

    public int getTicket() {
        return ticket;
    }

    public void setTicket(int ticket) {
        this.ticket = ticket;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre_perro() {
        return nombre_perro;
    }

    public void setNombre_perro(String nombre_perro) {
        this.nombre_perro = nombre_perro;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    
    
}
