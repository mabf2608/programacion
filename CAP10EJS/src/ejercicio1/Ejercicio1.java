package ejercicio1;

import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) {
        ArrayList<String> alumnos = new ArrayList<>();
        alumnos.add("Miguel");
        alumnos.add("Eloy");
        alumnos.add("Adrian");
        alumnos.add("Juan Carlos");
        alumnos.add("Antonio");
        alumnos.add("Samuel");
        System.out.println();
        for(String alumno:alumnos){
            System.out.println(alumno);
        }
    }
}
