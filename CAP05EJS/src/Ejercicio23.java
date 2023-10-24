public class Ejercicio23 {
    public static void main(String[] args) {
        System.out.println();
        boolean introducir = true;
        int cont;
        float n1, suma, medi = 0;
        cont = 1;
        suma = 0;
        while(introducir){
        System.out.printf("Número %d: %n",cont);
        n1= Float.parseFloat(System.console().readLine());
        suma=suma+n1;
        cont++;
        medi=suma/(cont-1);
        if (suma>10000){
            System.out.println();
            System.out.println("Saliendo del programa...");
            System.out.println();
            System.out.printf("El total acumulado es %.2f.%n",suma);
            System.out.printf("El contador de números es %d.%n",cont-1);
            System.out.printf("La media de los números es %.2f.%n",medi);
            introducir=false;
        }
        }
    }
}
