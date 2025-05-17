
package Entidad;

public class clsEArticulo {
    private int id_articulo;
    private int id_empleado;
    private String nombre;
    private String descripcion;
    private String fecha;
    private float precio_unitario;
    private int cantidad;

    public clsEArticulo() {
    }

    public clsEArticulo(int id_articulo, int id_empleado, String nombre, String descripcion, String fecha, float precio_unitario, int cantidad) {
        this.id_articulo = id_articulo;
        this.id_empleado = id_empleado;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.precio_unitario = precio_unitario;
        this.cantidad = cantidad;
    }

    public int getId_articulo() {
        return id_articulo;
    }

    public void setId_articulo(int id_articulo) {
        this.id_articulo = id_articulo;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public float getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(float precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    
    
}
