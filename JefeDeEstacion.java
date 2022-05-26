
package examen1;

import java.time.LocalDate;

/**
 *
 * @author Abdel
 */
public class JefeDeEstacion extends Empleado {
    private LocalDate fecha_alta;

    public JefeDeEstacion(String nombre, String dni, double sueldo, LocalDate fecha_alta) {
        super(nombre, dni, sueldo);
        this.fecha_alta = fecha_alta;
    }

    public LocalDate getFecha_alta() {
        return fecha_alta;
    }
    
     @Override
    public String toString() {
        String datos = "";
        datos += "\tFicha de Jefe de esta:\n";
        return super.toString() + "Fecha de nombrameinto como jefe: " + fecha_alta;
    }
}
