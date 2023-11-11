/*
*Ejercicio 56 | Tema 5
*Triangulo invertido derecha
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio56 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Introduzca la altura de la figura: ");
            int a=Integer.parseInt(System.console().readLine());
        int i=0, j=0;
        for (i=0;i<=a;i++){
            System.out.println();
            for(j=0;j<i;j++){
                System.out.print(" ");
            }
            for(j=1;j<=a-i;j++){
                System.out.print("*");
            }
        }
    }
}

