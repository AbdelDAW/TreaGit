
package examen1;

/**
 *
 * @author Abdel
 */
public class Locomotora {
    private final String matricula;
    private final int potencia;
    private final int antiguedad;
    private Mecanico mecanico;

    public Locomotora(String matricula, int potencia, int antiguedad, Mecanico mecanico) {
        this.matricula = matricula;
        this.potencia = potencia;
        this.antiguedad = antiguedad;
        this.mecanico = mecanico;
    }
    
     
    public String getMatricula() {
        return matricula;
    }

    public int getPotencia() {
        return potencia;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public Mecanico getMecanico() {
        return mecanico;
    }

    public void setMecanico(Mecanico mecanico) {
        this.mecanico = mecanico;
    }
    
    @Override
    public String toString() {
        String datos = "";
        datos += "\tLocomotora: \n" ;
        datos += "Matricula: " + matricula + "\n";
        datos += "Potencia de motor: " + potencia + "\n";
        datos +=  "Anteguidad: " + antiguedad + "\n";
        datos += "El mecanico asignado: " +"\n"+ mecanico + "\n";
        return datos;
    }
}
