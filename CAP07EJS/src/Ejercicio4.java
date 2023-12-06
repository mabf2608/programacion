/*
*Ejercicio 4 | Tema 7
*3 arrays.
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println();
        int[] numero=new int[20];
        int[] cuadrado=new int[20];
        int[] cubo=new int[20];
        for(int i=0;i<20;i++){
            numero[i]=(int)(Math.random()*101);
            cuadrado[i]=(int)(Math.pow(numero[i], 2));
            cubo[i]=(int)(Math.pow(numero[i], 3));
            System.out.printf("|%-7d|%-7d|%-7d|%n",numero[i],cuadrado[i],cubo[i]);
        }
    }
}