import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
    Scanner leer = new Scanner (System.in);

    System.out.println("Introduce tu nombre: ");
        String nombre=leer.nextLine();
        
    System.out.println("Introduce tus apellidos: ");
        String ape=leer.nextLine();

    System.out.println("Te llamas "+nombre+" "+ape);

    leer.close();
    }
}
