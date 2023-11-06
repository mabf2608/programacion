/*
*Ejercicio 41 | Tema 5
*Digitos pares e impares
*@author Miguel Ángel Bonilla Fernández 1ºDAW
*/
public class Ejercicio41 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Por favor, introduzca un número entero positivo: ");
        long n = Long.parseLong(System.console().readLine());
        long aux = n;
        boolean seguir = true;
        int sumarp=0,sumari=0;
        System.out.println();
        while (seguir){
            if ((n%10)%2==0){
                sumarp=sumarp+1;
            }else{
                sumari=sumari+1;
            }
            n=n/10;
            if(n<1){
                seguir=false;
            }
        }
        System.out.printf("En el número %d hay %d dígitos pares y %d dígitos impares.",aux,sumarp,sumari);
    }
}