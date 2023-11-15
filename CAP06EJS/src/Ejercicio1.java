/*
*Ejercicio 1 | Tema 6
*Tres dados
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio1 {
    public static void main(String[] args) {
        int suma=0;
        for (int i=1;i<=3;i++){
            int dado=(int)(Math.random()*6)+1;
            System.out.printf("En el dado %d te ha salido: %d%n",i,dado);
            suma+=dado;
        }
        System.out.printf("La suma de los dados es: %d%n",suma);
    }
}