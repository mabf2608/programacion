/*
*Ejercicio 5 | Tema 7
*Array con máximos y mínimos.
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("Introduzca 10 números: ");
        int[] numero=new int[10];
        int nmax=Integer.MIN_VALUE, nmin=Integer.MAX_VALUE;
        for(int i=0;i<10;i++){
            numero[i]=Integer.parseInt(System.console().readLine());
            if (nmax<numero[i])
                nmax=numero[i];
            if (nmin>numero[i])
                nmin=numero[i];
        }
        System.out.println();
        System.out.printf("Máximo: %d%n",nmax);
        System.out.printf("Mínimo: %d%n",nmin);
    }
}