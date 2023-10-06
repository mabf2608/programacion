import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        int n1 = sc.nextInt();

        System.out.print("Introduce el segundo número: ");
        int n2= sc.nextInt();
        System.out.println();
        System.out.println("La suma de "+n1+" + "+n2+" es: "+(n1+n2));
        System.out.println("La resta de "+n1+" - "+n2+" es: "+(n1-n2));
        System.out.println("La multiplicación de "+n1+" * "+n2+" es: "+(n1*n2));
        System.out.println("La división de "+n1+" / "+n2+" es: "+(n1/n2));

        sc.close();
    }
}