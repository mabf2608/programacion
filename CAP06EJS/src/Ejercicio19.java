/*
*Ejercicio 19 | Tema 6
*50 numeros del -100 al 200
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio19 {
    public static void main(String[] args) {
        System.out.println();
        int cantidad=50;
        int intervaloMax=200,intervaloMin=-101,nmax=intervaloMin-1,nmin=intervaloMax+1,suma=0;
        for (int i=1;i<=cantidad;i++){
            int n=(int)(Math.random()*(intervaloMax-intervaloMin+1)+intervaloMin);
            if(n%2==0&&n>nmax){
                nmax=n;
            }
            if(n%2!=0&&n<nmin){
                nmin=n;
            }
            suma+=n;
            System.out.print(n+" ");
        }
        System.out.println();
        System.out.println();
        System.out.printf("El nmax de los pares es: %d.%n",nmax);
        System.out.printf("El nmin de los impares es: %d.%n",nmin);
        System.out.printf("La media es: %d.%n",suma/cantidad);
    }
}
