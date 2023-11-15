/*
*Ejercicio 13 | Tema 6
*Tirada de dados
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio13 {
    public static void main(String[] args) {
        System.out.println();
        boolean seguir=true;
        while (seguir) {
            int d1=(int)(Math.random()*6+1),d2=(int)(Math.random()*6+1);
            System.out.printf("El resultado del dado 1 es: %d.%n",d1);
            System.out.printf("El resultado del dado 2 es: %d.%n",d2);
            if(d1==d2){
                seguir=false;
            }
            System.out.println();
        }
    }
}