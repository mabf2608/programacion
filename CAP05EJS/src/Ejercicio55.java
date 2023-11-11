/*
*Ejercicio 55 | Tema 5
*Numeros izquierda derecha
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio55 {
    public static String digitos(long v1){
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
        return dato;
    }
    public static void main(String[] args) {
        System.out.println();
        System.out.print("Introduzca un número: ");
        long n = Long.parseLong(System.console().readLine());
        String dato="";
        int n1=0;
        if (n>10){
            n1=(int)n%10;
            n=n/10;
            dato=digitos(n);
            n=Long.parseLong(dato);
            int l=dato.length(), i=0, j=0;
            dato="";
            for (i=1;i<=l;i++){
                j=(int)n%10;
                n=n/10;
                dato=dato+j;
            }
            dato=n1+dato;
        }
        else{
            dato=n+dato;
        }
        System.out.printf("El número resultado es %s.%n",dato);
    }
}