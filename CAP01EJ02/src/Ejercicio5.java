import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.print("Introduce la cantidad de pesetas que quieres pasar a euros: ");
        int pesetas = leer.nextInt();
        float euros = pesetas/166;
    System.out.printf("%d pesetas en euros son aproximadamente: %.2f €",pesetas, euros);

    leer.close();
    }
}