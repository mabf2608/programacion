
/*
*Ejercicio 24 | Tema 6
*Digito aleatorio
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio24 {
    public static void main(String[] args) {
        System.out.println();
        System.out.print("Por favor, introduzca un número entero positivo: ");
        long n=Long.parseLong(System.console().readLine());
        long numero=n;
        //Calcula la longitud del número
        int longitud=0;
        do{
            n/=10;
            longitud++;
        }while(n>0);
        //Elige una posición aleatoria del número
        int posicion=(int)(Math.random()*longitud+1);
        //Imprime el dígito aleatorio
        System.out.println((numero/(long)(Math.pow(10,longitud-posicion)))%10);
    }
}