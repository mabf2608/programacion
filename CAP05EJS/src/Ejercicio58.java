/*
*Ejercicio 58 | Tema 5
*Media Digitos
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio58 {
    public static void main(String[] args) {
        System.out.println();
        System.out.print("Introduzca un número: ");
        long n=Long.parseLong(System.console().readLine());
        String dato=""+n;
        int l=dato.length(),i=0,j=0;
        for (i=1;i<=l;i++){
            j=j+(int)n%10;
            n=n/10;
        }
        float m=(float)j/l;
        System.out.printf("La media de sus numeros es %.2f.%n",m);
    }
}