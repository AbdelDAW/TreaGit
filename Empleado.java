
package examen1;

/**
 *
 * @author Abdel   "11173535@alu.murciaeduca.es" #cambios
 */
public class Empleado {
    private final String nombre;
    private final String dni;
    private final double sueldo;

    public Empleado(String nombre, String dni, double sueldo) {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public double getSueldo() {
        return sueldo;
    }

    @Override
    public String toString() {
        String datos = "";
        datos += "Nombre: " + nombre + "\n";
        datos += "Dni: " + dni + "\n";
        datos += "Sueldo: " +sueldo+"€\n";
        return datos;
    }
    
}
