import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la cantidad de pesetas que quieras pasar a euros: ");
        int pesetas = sc.nextInt();
        float euros = (float)(pesetas/166.386);

        System.out.printf("%d pesetas son aproximadamente %.2f €", pesetas,euros);
        sc.close();
    }
}
