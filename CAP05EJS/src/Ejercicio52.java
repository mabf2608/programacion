/*
*Ejercicio 52 | Tema 5
*Números izquierda derecha 1 posición
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio52 {
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
        String dato=digitos(n);
        n=Long.parseLong(dato);
        int l=dato.length(), n1=(int)n%10, i=0, j=0;
            n=n/10;
            dato="";
        for (i=1;i<=l-1;i++){
            j=(int)n%10;
            n=n/10;
            if(i==1&&j==0){}
            else{
                dato=dato+j;
            }
        }
        dato=dato+n1;
        System.out.printf("El número resultado es %s.%n",dato);
    }
}
