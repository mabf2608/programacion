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
        int posmax=0, posmin=0;
        for(int i=0;i<10;i++){
            numero[i]=Integer.parseInt(System.console().readLine());
            if (nmax<numero[i]){
                nmax=numero[i];
                posmax=i;
            }
            if (nmin>numero[i]){
                nmin=numero[i];
                posmin=i;
            }
        }
        System.out.println();
        for(int i=0;i<10;i++){
            System.out.printf("%d ",numero[i]);
            if (posmax==i)
                System.out.printf("máximo ");
            if (posmin==i)
                System.out.printf("mínimo ");
        }
    }
}