import java.util.Scanner;

public class Ejercicio2{
public static void main(String[] args) {
    
    Scanner leer = new Scanner (System.in);

    System.out.println("Introduce tu nombre: ");
        String nombre=leer.nextLine();
        
    System.out.println("Introduce tus apellidos: ");
        String ape=leer.nextLine();

    System.out.println("Introduce tu dirección: ");
        String dir=leer.nextLine();

    System.out.println("Introduce tu número de teléfono: ");
        int num=leer.nextInt();

    System.out.println("Te llamas "+nombre+" "+ape+", vives en "+dir+" y tu número de telefono es "+num+".");
    leer.close();
    }
}