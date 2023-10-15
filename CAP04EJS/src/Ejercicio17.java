public class Ejercicio17 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Introduce un número entero: ");
        int n = Integer.parseInt(System.console().readLine());
        int cifra = n%10;
        System.out.printf("La primera cifra del numero %d es %d.",n,cifra);
    }
}
