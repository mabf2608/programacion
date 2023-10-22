public class Ejercicio14 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Introduce una base: ");
        int b = Integer.parseInt(System.console().readLine());
        System.out.println("Introduce un exponente: ");
        int e = Integer.parseInt(System.console().readLine());
        int n = 1;
        System.out.println();
        for (int i = 1; i <= e; i++){
            n = n*b; 
            System.out.print(n+" ");
        }
   }
}
