/*
*Ejercicio 2 | Tema 7
*Imprime un Array Char.
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio2 {
    public static void main(String[] args) {
        char[] simbolo=new char[10];
        simbolo[0]='a';
        simbolo[1]='x';
        simbolo[4]='@';
        simbolo[6]=' ';
        simbolo[7]='+';
        simbolo[8]='Q';
        for(int i=0;i<10;i++){
            System.out.print(simbolo[i]+" ");
        }
        //cuando no se le da valor a un caracter de un array se muestra un espacio
    }
}
