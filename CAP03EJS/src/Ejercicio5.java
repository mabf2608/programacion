import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la altura del rectángulo: ");
        int altura = sc.nextInt();

        System.out.println("Introduce la base del rectángulo: ");
        int base = sc.nextInt();

        System.out.println();
        int area = base*altura;
        System.out.println("El área del rectángulo es: "+area);
        sc.close();
    }
}
