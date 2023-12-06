/*
*Ejercicio 3 | Tema 7
*Pedir 10 nums y mostrarlos en orden inverso.
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println();
        int[] num=new int[10];
        //Pide los valores
        for(int i=0;i<10;i++){
            System.out.printf("Introduce el valor %d: %n",i);
            num[i]=Integer.parseInt(System.console().readLine());
        }
        System.out.println();
        //Muestra los valores
        for(int i=9;i>=0;i--){
            System.out.print(num[i]+" ");
        }
    }
}
