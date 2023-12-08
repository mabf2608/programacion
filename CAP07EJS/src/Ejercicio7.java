/*
*Ejercicio 7 | Tema 7
*Cambio de valores en arrays.
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio7 {
    public static void main(String[] args) {
        System.out.println();
        int[] numeros=new int[100];
        for (int i=0;i<100;i++){
            numeros[i]=(int)(Math.random()*21);
            System.out.print(numeros[i]+" ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Ahora introduce 2 valores, el primero se sustituirá por el segundo en la lista generada: ");
        System.out.print("Valor 1= ");
        int valor1=Integer.parseInt(System.console().readLine());
        System.out.print("Valor 2= ");
        int valor2=Integer.parseInt(System.console().readLine());
        System.out.println();
        for(int i=0;i<100;i++){
            if(numeros[i]==valor1){
                numeros[i]=(int)(valor2);
                System.out.print("'"+numeros[i]+"' ");
            }else{
                System.out.print(numeros[i]+" ");
            }
        }
    }
}
