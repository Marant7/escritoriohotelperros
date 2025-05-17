
package Entidad;
import java.util.Date;

public class clsEDetalleServicio {
    private int id_detalle_servicio;
    private int id_servicio;
    private int id_articulo;
    private int cantidad;

    public clsEDetalleServicio() {
    }

    public clsEDetalleServicio(int id_detalle_servicio, int id_servicio, int id_articulo, int cantidad) {
        this.id_detalle_servicio = id_detalle_servicio;
        this.id_servicio = id_servicio;
        this.id_articulo = id_articulo;
        this.cantidad = cantidad;
    }

    public int getId_detalle_servicio() {
        return id_detalle_servicio;
    }

    public void setId_detalle_servicio(int id_detalle_servicio) {
        this.id_detalle_servicio = id_detalle_servicio;
    }

    public int getId_servicio() {
        return id_servicio;
    }

    public void setId_servicio(int id_servicio) {
        this.id_servicio = id_servicio;
    }

    public int getId_articulo() {
        return id_articulo;
    }

    public void setId_articulo(int id_articulo) {
        this.id_articulo = id_articulo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
