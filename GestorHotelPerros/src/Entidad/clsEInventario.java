package Entidad;

public class clsEInventario {
    private int id_inventario;
    private int id_articulo;
    private String id_empleado;
    private int stock;
    private String nombre;

    public clsEInventario() {
    }

    public clsEInventario(int id_inventario, int id_articulo, String id_empleado, int stock, String nombre) {
        this.id_inventario = id_inventario;
        this.id_articulo = id_articulo;
        this.id_empleado = id_empleado;
        this.stock = stock;
        this.nombre = nombre;
    }

    public int getId_inventario() {
        return id_inventario;
    }

    public void setId_inventario(int id_inventario) {
        this.id_inventario = id_inventario;
    }

    public int getId_articulo() {
        return id_articulo;
    }

    public void setId_articulo(int id_articulo) {
        this.id_articulo = id_articulo;
    }

    public String getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(String id_empleado) {
        this.id_empleado = id_empleado;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
}
