package calificaciones;
import java.util.Scanner;

public class Calificaciones2 {
    String nombre = "";
    int[] calif= new int[5];

    public static void main(String[] args) {
        String capturaNombre="";
        float promedioResult=0;
        String califNota= "  ";

        Calificaciones pCalculoCalif = new Calificaciones() ;
        System.out.print("CALIFICACIONES TECMILENIO\n");

        Scanner s = new Scanner(System.in);
        System.out.print("Nombre del alumno:   ");
        capturaNombre=s.next();
        pCalculoCalif.setNombre(capturaNombre);

        pCalculoCalif.setCalificaciones();
        promedioResult =pCalculoCalif.promedioCal();

    }
}
