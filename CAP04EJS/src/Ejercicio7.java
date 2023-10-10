import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce el primer número para realizar la media: ");
    float n1 = sc.nextFloat();

    System.out.println("Introduce el segundo número para realizar la media: ");
    float n2 = sc.nextFloat();

    System.out.println("Introduce el tercer número para realizar la media: ");
    float n3 = sc.nextFloat();
    
    float media = (n2+n1+n3)/3;

    System.out.printf("La nota media es %.2f",media);
    sc.close();
    }
}
