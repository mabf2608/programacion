import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        //Volumen cono = 1/3 * 3,14 * r^2*h
        Scanner sc = new Scanner(System.in);
        double pi = 3.14;
        System.out.print("Introduce el radio del cono: ");
        int r = sc.nextInt();

        System.out.print("Introduce la altura del cono: ");
        int h = sc.nextInt();

        double total = (1.0/3*pi*(r*r)*h);

        System.out.printf("El volumen del cono con radio %d y altura %d es: %.2f",r,h,total);
        sc.close();
    }
}
