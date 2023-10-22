public class Ejercicio11{
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Introduce un número y te diré el cuadrado y el cubo de los 5 siguientes números: ");
        int n = Integer.parseInt(System.console().readLine());
        System.out.println();
        int n2,n3;
        for(int i=1;i<=5;i++){
        n=n+1;
        n2 = (int)Math.pow(n, 2);
        n3 = (int)Math.pow(n, 3);
        System.out.printf("%-1d%15d%15d%n",n, n2, n3);
    }
    }
}
