import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la altura del triángulo: ");
        int altura = sc.nextInt();

        System.out.println("Introduce la base del triángulo: ");
        int base = sc.nextInt();

        System.out.println();
        int area = (base*altura)/2;
        System.out.println("El área del rectángulo es: "+area);
        sc.close();
    }
}
