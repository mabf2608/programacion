/*
*Ejercicio 5 | Tema 6
*50 numeros aleatorios
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println();
        int n=50,i=0;
        for(i=1;i<=n;i++){
            System.out.print(((int)(Math.random()*100)+100)+" ");
            System.out.println();
        }
    }
}