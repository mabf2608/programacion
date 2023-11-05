/*Escribe un programa que, dado un número entero positivo, diga cuáles son y
cuánto suman los dígitos pares. Los dígitos pares se deben mostrar en orden, de
izquierda a derecha. Usa long en lugar de int donde sea necesario para admitir
números largos.
Ejemplo 1:
Por favor, introduzca un número entero positivo: 94026782
Dígitos pares: 4 0 2 6 8 2
Suma de los dígitos pares: 22
Ejemplo 2:
Por favor, introduzca un número entero positivo: 31779
Dígitos pares:
Suma de los dígitos pares: 0
Ejemplo 3:
Por favor, introduzca un número entero positivo: 2404
Dígitos pares: 2 4 0 4
Suma de los dígitos pares: 10 */

public class Ejercicio32 {
    public static void nep(long v1){
        boolean seguir = true;
        double p = v1;
        int i=0;
        String dato="";
        while (seguir){
            i=(int)(p%10);
            p=p/10;
            dato=dato+i;
            if (p<1){
                seguir=false;
            }
        }
        int j=0;
        int l = dato.length();
        long n2=Long.parseLong(dato);
        int suma=0;
        seguir=true;
        System.out.print("Dígitos pares: ");
        for(i=1;i<=l;i++){
            j=(int)n2%10;
            if (j%2==0){
                System.out.print(j+" ");
                suma=suma+j;
            }
            n2=n2/10;
        } 
        System.out.println();
        System.out.printf("La suma de los números pares es: %d%n",suma);
    }
    public static void main(String[] args) {
        System.out.println();
        System.out.print("Introduzca un número entero positivo: ");
        long n = Long.parseLong(System.console().readLine());
        nep(n);
    }
}