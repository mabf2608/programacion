public class Ejercicio6 {
    public static void main(String[] args) {
    double base, iva, total;
    base=22.75;
    iva=4.78;
    total=base+iva;

    System.out.printf("%-15s\t%5.2f%n", "Base imponible: ",base);
    System.out.printf("%-20s\t%5.2f%n", "IVA: ",iva);
    System.out.printf("-----------------------------%n");
    System.out.printf("%-20s\t%5.2f%n", "Total: ",total);
    }
}
