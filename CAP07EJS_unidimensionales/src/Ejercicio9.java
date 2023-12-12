/*
*Ejercicio 9 | Tema 7
*Numero enteros par-impar.
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio9 {
    public static String parimpar(int numero){
        if(numero%2==0){
            return "par";
        }else{
            return "impar";
        }
    }
    public static void main(String[] args) {
        int[] numeros=new int[8];
        System.out.println();
        for(int i=0;i<8;i++){
            System.out.printf("Introduce el numero: %d: %n",i+1);
            numeros[i]=Integer.parseInt(System.console().readLine());
        }
        System.out.println();
        for(int i=0;i<8;i++){
            System.out.printf("El numero %d es %s.%n",numeros[i],parimpar(numeros[i]));
        }
    }
}
