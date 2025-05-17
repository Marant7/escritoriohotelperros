
package Entidad;

import java.util.Date;

public class clsEFuncion {
    private int id_funcion;
    private int id_empleado;
    private String descripcion;
    private Date inicio_contratacion;
    private String fin_contratacion;
    private int salario;
    private String estado;

    public clsEFuncion() {
    }

    public clsEFuncion(int id_funcion, int id_empleado, String descripcion, Date inicio_contratacion, String fin_contratacion, int salario, String estado) {
        this.id_funcion = id_funcion;
        this.id_empleado = id_empleado;
        this.descripcion = descripcion;
        this.inicio_contratacion = inicio_contratacion;
        this.fin_contratacion = fin_contratacion;
        this.salario = salario;
        this.estado = estado;
    }

    public int getId_funcion() {
        return id_funcion;
    }

    public void setId_funcion(int id_funcion) {
        this.id_funcion = id_funcion;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getInicio_contratacion() {
        return inicio_contratacion;
    }

    public void setInicio_contratacion(Date inicio_contratacion) {
        this.inicio_contratacion = inicio_contratacion;
    }

    public String getFin_contratacion() {
        return fin_contratacion;
    }

    public void setFin_contratacion(String fin_contratacion) {
        this.fin_contratacion = fin_contratacion;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

   
     
}
