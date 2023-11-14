/*
*Ejercicio 6 | Tema 6
*Adivinar números
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio6 {
    public static void main(String[] args) {
        boolean seguir = true;
        int nsecreto = (int)(Math.random()*101);
        int i=5;
        while (seguir) {
            System.out.println();
            System.out.println("Introduce un número para intentar adivinar el secreto(0 al 100): ");
            int n = Integer.parseInt(System.console().readLine());
            if (n==nsecreto){
                System.out.println();
                System.out.println("¡Enhorabuena! Has adivinado el número secreto.");
                seguir=false;
            }else{
                System.out.println();
                i--;
                if (i>0&&i<5){
                    System.out.printf("Te quedan %d intentos.%n",i);
                    if (n>nsecreto)
                    System.out.printf("Buen intento, pero el número secreto es menor que %d.%n",n);
                    if (n<nsecreto)
                    System.out.printf("Buen intento, pero el número secreto es mayor que %d.%n",n);
                }else{
                    System.out.printf("Te has quedado sin intentos, el número era: %d.%n",nsecreto);
                    seguir=false;
                }
            }
        }
    }
}
