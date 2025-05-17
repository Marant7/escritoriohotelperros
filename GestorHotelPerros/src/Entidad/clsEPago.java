
package Entidad;

import java.util.Date;

public class clsEPago {
    private int id_pago;
    private int id_empleado;
    private int id_reserva;
    private Date fecha_pago;
    private double  monto;
    private int codigo_ticket;

    public clsEPago() {
    }

    public clsEPago(int id_pago, int id_empleado, int id_reserva, Date fecha_pago, double monto, int codigo_ticket) {
        this.id_pago = id_pago;
        this.id_empleado = id_empleado;
        this.id_reserva = id_reserva;
        this.fecha_pago = fecha_pago;
        this.monto = monto;
        this.codigo_ticket = codigo_ticket;
    }

    public int getId_pago() {
        return id_pago;
    }

    public void setId_pago(int id_pago) {
        this.id_pago = id_pago;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public int getId_reserva() {
        return id_reserva;
    }

    public void setId_reserva(int id_reserva) {
        this.id_reserva = id_reserva;
    }

    public Date getFecha_pago() {
        return fecha_pago;
    }

    public void setFecha_pago(Date fecha_pago) {
        this.fecha_pago = fecha_pago;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getCodigo_ticket() {
        return codigo_ticket;
    }

    public void setCodigo_ticket(int codigo_ticket) {
        this.codigo_ticket = codigo_ticket;
    }

    

    
}
