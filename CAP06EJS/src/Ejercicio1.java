/*
*Ejercicio 1 | Tema 6
*Tres dados
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio1 {
    public static void main(String[] args) {
        int dado1=(int)(Math.random()*6)+1;
        int dado2=(int)(Math.random()*6)+1;
        int dado3=(int)(Math.random()*6)+1;
        int suma=dado1+dado2+dado3;
        System.out.println();
        System.out.printf("En el dado 1 te ha salido: %d%n",dado1);
        System.out.printf("En el dado 2 te ha salido: %d%n",dado2);
        System.out.printf("En el dado 3 te ha salido: %d%n",dado3);
        System.out.printf("La suma de los dados es: %d%n",suma);
    }
}