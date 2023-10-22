public class Ejercicio12 {
    public static void main(String[] args) {
        System.out.println();
        System.out.print("Introduce la cantidad de números de la serie de Fibonacci quieres ver: ");
        int cant = Integer.parseInt(System.console().readLine());
        int n1, n2, n3;
        n1 = 1;
        n2 = 0;
        n3 = 0;
        for(int i = 1;i <= cant; i++){
            System.out.print(n3+" ");
            n3 = n1+n2;
            n1 = n2;
            n2 = n3;
        }
    }
}
