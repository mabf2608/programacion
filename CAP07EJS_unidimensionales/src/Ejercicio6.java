/*
*Ejercicio 6 | Tema 7
*Array rotación.
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Introduzca 15 números: ");
        int[] numero=new int[15];
        for(int i=0;i<15;i++){
            numero[i]=Integer.parseInt(System.console().readLine());
        }
        int aux=numero[14];
        System.out.println();
        for(int i=14;i>0;i--){
            numero[i]=numero[i-1];
        }
        for(int i=0;i<15;i++){
            numero[0]=aux;
            System.out.print(numero[i]+" ");
        }
        System.out.println();
    }
}