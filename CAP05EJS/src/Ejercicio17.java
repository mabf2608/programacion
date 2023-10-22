public class Ejercicio17 {
    public static void main(String[] args) {
        System.out.println();
        System.out.print("Introduce un número entero y positivo: ");
        int n = Integer.parseInt(System.console().readLine());
        int i, n2;
        n2=0;
        for(i = 1;i<=100;i++){
            n2=n2+(n+i);
        }
        System.out.println(n2);
    }
}
