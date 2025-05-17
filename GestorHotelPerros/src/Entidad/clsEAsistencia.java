
package Entidad;

import java.sql.Time;
import java.time.LocalDate;


/**
 *
 * @author Fabiola
 */
public class clsEAsistencia {
        
    private int id_empleado;
    private LocalDate fecha_actual;
    private Time hora_ingreso;
    private Time hora_salida;

    public clsEAsistencia() {
    }

    public clsEAsistencia(int id_empleado, LocalDate fecha_actual, Time hora_ingreso, Time hora_salida) {
        this.id_empleado = id_empleado;
        this.fecha_actual = fecha_actual;
        this.hora_ingreso = hora_ingreso;
        this.hora_salida = hora_salida;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public LocalDate getFecha_actual() {
        return fecha_actual;
    }

    public void setFecha_actual(LocalDate fecha_actual) {
        this.fecha_actual = fecha_actual;
    }

    public Time getHora_ingreso() {
        return hora_ingreso;
    }

    public void setHora_ingreso(Time hora_ingreso) {
        this.hora_ingreso = hora_ingreso;
    }

    public Time getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(Time hora_salida) {
        this.hora_salida = hora_salida;
    }

   
    
}
