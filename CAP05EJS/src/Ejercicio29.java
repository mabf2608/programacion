/*Escribe un programa que muestre por pantalla todos los números enteros
positivos menores a uno leído por teclado que no sean divisibles entre otro
también leído de igual forma. */

public class Ejercicio29 {
    public static void numeros(int v1, int v2){
        int i = 0;
        for (i=1 ; i<v1 ; i++){
            if (i%v2!=0){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Introduce el número límite: ");
        int n = Integer.parseInt(System.console().readLine());
        System.out.println("Introduce el número divisor: ");
        int d = Integer.parseInt(System.console().readLine());

        if(n<=0 || d<= 0){
        System.out.println();
        System.out.println("ERROR: Introduce números enteros positivos que no sean 0");
        }else{
        numeros(n,d);
        }
    }
}
