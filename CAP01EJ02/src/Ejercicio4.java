import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.print("Introduce la cantidad de euros que quieres pasar a pesetas: ");
        float euros = leer.nextFloat();
        int pesetas = (int)(euros*166);
    System.out.printf("%.2f € en pesetas son aproximadamente: %d", euros, pesetas);

    leer.close();
    }
}
