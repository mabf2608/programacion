/*
*Ejercicio 43 | Tema 5
*Numero partido
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio43 {
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
        boolean seguir = true;
        long n=0;
        while (seguir){
            System.out.println();
            System.out.println("Introduce un número entero positivo de 2 dígitos o más: ");
            n = Long.parseLong(System.console().readLine());
            if(n<10){
                System.out.println();
                System.out.println("ERROR: Introduce un número entero positivo mayor o igual que 10.");
            }else{
                seguir=false;
            }
        }
        int l=0,p=0;
        seguir=true;
        while(seguir){
            System.out.println();
            System.out.println("Introduzca la posición desde la cual se quiere partir el número: ");
            p = Integer.parseInt(System.console().readLine());
            l=digitos(n).length();
            if(p>=2 && p<=l){
                seguir=false;
            }else{
                System.out.println();
                System.out.println("ERROR: La posición tiene que ser mínimo 2 y como mucho la longitud del número.");
            }
        }
        n=Long.parseLong(digitos(n));
        int d = 0;
        String n1 = "";
        String n2 = "";
        for (int i=1;i<=l;i++){
            d=(int)n%10;
            if (i<p){
                n1=n1+d;
            }else{
                n2=n2+d;
            }
            n=n/10;
        }
        System.out.println();
        System.out.printf("Los números partidos son el %s y el %s",n1,n2);
    }
}