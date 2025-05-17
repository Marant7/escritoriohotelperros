
package Entidad;

public class clsEKardex {
    private int id_movimiento;
    private int id_inventario;
    private int id_empleado;
    private String tipo_movimiento;
    private String comentario;
    private String fecha;
    private int cantidad;

    public clsEKardex() {
    }

    public clsEKardex(int id_movimiento, int id_inventario, int id_empleado, String tipo_movimiento, String comentario, String fecha, int cantidad) {
        this.id_movimiento = id_movimiento;
        this.id_inventario = id_inventario;
        this.id_empleado = id_empleado;
        this.tipo_movimiento = tipo_movimiento;
        this.comentario = comentario;
        this.fecha = fecha;
        this.cantidad = cantidad;
    }

    public int getId_movimiento() {
        return id_movimiento;
    }

    public void setId_movimiento(int id_movimiento) {
        this.id_movimiento = id_movimiento;
    }

    public int getId_inventario() {
        return id_inventario;
    }

    public void setId_inventario(int id_inventario) {
        this.id_inventario = id_inventario;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getTipo_movimiento() {
        return tipo_movimiento;
    }

    public void setTipo_movimiento(String tipo_movimiento) {
        this.tipo_movimiento = tipo_movimiento;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
