import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la cantidad de euros que quieres pasar a pesetas: ");
        float euros = sc.nextFloat();
        int pesetas = (int)(euros*166);
        
        System.out.printf("%.2f € son aproximadamente %d pesetas.", euros, pesetas);
        sc.close();
    }
}