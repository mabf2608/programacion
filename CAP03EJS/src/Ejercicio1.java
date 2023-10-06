import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe el primer número: ");
        int n1 = sc.nextInt();

        System.out.print("Escribe el segundo número: ");
        int n2 = sc.nextInt();

        System.out.println("El resultado de "+n1+" * "+n2+" es: "+n1*n2);

        sc.close();
    }
}
