/*
*Ejercicio 9 | Tema 6
*pares de 0 a 100
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio9 {
    public static void main(String[] args) {
        System.out.println();
        boolean seguir=true;
        int n=0,cont=0;
        while(seguir){
            n=(int)(Math.random()*101);
            if (n%2==0){
                System.out.print(n+" ");
                cont++;
            }
            if (n==24){
                seguir=false;
            }
        }
        System.out.println();
        System.out.printf("Se han impreso un total de %d números.%n",cont);
    }
}
