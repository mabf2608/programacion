/*
*Ejercicio 4 | Tema 6
*20 numeros aleatorios
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println();
        for(int i=1;i<=20;i++){
            System.out.print((int)(Math.random()*11)+"  ");
        }
    }
}