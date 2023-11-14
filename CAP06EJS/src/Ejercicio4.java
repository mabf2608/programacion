/*
*Ejercicio 4 | Tema 6
*20 numeros aleatorios
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println();
        int n=20,i=0;
        for(i=1;i<=n;i++){
            System.out.print((int)(Math.random()*11)+"  ");
        }
    }
}