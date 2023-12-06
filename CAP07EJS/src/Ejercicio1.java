/*
*Ejercicio 1 | Tema 7
*Imprime un Array Int.
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        //int[] num = {8,-2,0,0,0,0,14,0,5,120,0,0};
        int[] num = new int[12];
        num[0]=8;
        num[1]=-2;
        num[4]=0;
        num[6]=14;
        num[8]=5;
        num[9]=120;
        for(int i=0;i<12;i++){
            System.out.print(num[i]+" ");
        }
        //cuando no se le da valor a un número de un array al imprimirlo por pantalla muestra un 0
    }
}
