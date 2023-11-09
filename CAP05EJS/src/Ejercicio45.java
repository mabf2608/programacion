/*
*Ejercicio 45 | Tema 5
*Cambio digito
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio45 {
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
        boolean seguir=true;
        int p=0, d=0;
        long n=0;
        while(seguir){
            System.out.println("Introduce un número entero positivo: ");
            n = Long.parseLong(System.console().readLine());
            if(n>0){
                seguir=false;
            }
        }
        seguir=true;
        while(seguir){
            System.out.println("Introduzca la posición donde quieras insertar: ");
            p = Integer.parseInt(System.console().readLine());
            if(p>0){
                seguir=false;
            }
        }
        seguir=true;
        while(seguir){
            System.out.println("Introduce el dígito a ingresar: ");
            d = Integer.parseInt(System.console().readLine());
            if(d>0){
                seguir=false;
            }
        }
        String dato=digitos(n);
        int l = dato.length();
        n=Long.parseLong(dato);
        int i = 0, j = 0;
        System.out.print("El número resultante es: ");
        for (i=1;i<=l;i++){
            j=(int)n%10;
            n=n/10;
            if (i==p)
                System.out.print(d);
            else
                System.out.print(j);
        }
    }
}
