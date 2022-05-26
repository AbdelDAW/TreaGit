
package examen1;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

/**
 *
 * @author Abdel
 */
public class Main {
    public static void main(String[] args) {
        ArrayList <Empleado> personal = new ArrayList <> ();
        Maquinista maq = new Maquinista("Tomas","Y536236",1650,"Rango 1");
        personal.add(maq);
        Mecanico mec = new Mecanico ("Alejandro","X6656676",1300,"614456793",Especialidad.MOTOR);
        personal.add(mec);
        JefeDeEstacion jefe = new JefeDeEstacion("David","C562354",1780,LocalDate.of(2015, Month.MARCH, 28));
        personal.add(jefe);
        for (Empleado e : personal) {
            if ( e instanceof Maquinista) {
                Maquinista mq = (Maquinista) e;
                System.out.println("Rango: "+mq.getRango());
            }else if ( e instanceof Mecanico) {
                Mecanico mc = (Mecanico) e;
                System.out.println("Especialidad: "+mc.getEspecialidad());
            }else if ( e instanceof JefeDeEstacion) {
                JefeDeEstacion jf = (JefeDeEstacion) e;
                System.out.println("Fecha de nombramiento: "+jf.getFecha_alta());
            }
        }
        System.out.println("------------------------------------------");
        
        Tren tr = new Tren(new Locomotora("55655TDF",800,20,mec),maq);
        tr.enganchaVagon(700, 450, "imuebles");
        tr.enganchaVagon(900, 700, "maderas");
        tr.enganchaVagon(700, 850, "imuebles");
        tr.enganchaVagon(900, 970, "maderas");
        tr.enganchaVagon(700, 1190, "imuebles");
        tr.enganchaVagon(900, 9900, "maderas");
        tr.enganchaVagon(900, 2760, "maderas");
        
        System.out.println(tr);
        
    }
}
