package calificaciones;
import java.util.Scanner;

public class Calificaciones {
    String nombre = "";
    int[] calif= new int[5];

    public float promedioCal () {
        float promedio=0;
                int suma=0;

        for (int i=0; i<calif.length; i++) {
            suma+=calif[i];
    }
        promedio=(suma/calif.length);

        System.out.println("El promedio final del alumno es: " +promedio);
        return promedio;

    }

    public char calificaciones(float pPromedio){
        char nota=' ';
        return nota;


    }

    public void imprime(float pPromedio, char pNota){

    }
    public void setNombre(String pNombre){
        nombre= pNombre;
    }
    public void setCalificaciones(){
        Scanner s = new Scanner(System.in) ;

        System.out.print("Calificacion 1:   ");
        calif[0] =s.nextInt();
        System.out.print("Calificacion 2:   ");
        calif[0] =s.nextInt();
        System.out.print("Calificacion 3:   ");
        calif[0] =s.nextInt();
        System.out.print("Calificacion 4:   ");
        calif[0] =s.nextInt();
        System.out.print("Calificacion 5:   ");
        calif[0] =s.nextInt();

    }
}
