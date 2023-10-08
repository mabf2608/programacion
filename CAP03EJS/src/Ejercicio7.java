import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la base imponible de la factura: ");
        double base = sc.nextDouble();
        double iva = 0.21*base;
        double total = iva+base;

        System.out.printf("%-16s\t%5.2f%n","Base imponible: ",base);
        System.out.printf("%16s\t%5.2f%n","IVA: ",iva);
        System.out.printf("------------------------------%n");
        System.out.printf("%16s\t%5.2f%n","Total: ",total);
        
        sc.close();
    }
}
