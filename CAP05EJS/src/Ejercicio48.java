/*
*Ejercicio 48 | Tema 5
*Números que aparecen
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio48 {
    public static String digitos(long v1){
        String dato="";
        boolean seguir=true;
        long p = v1;
        int i=0;
        while(seguir){
            i=(int)p%10;
            p=p/10;
            dato=dato+i;
            if (p<1)
                seguir=false;
        }
        return dato;
    }
    public static void main(String[] args) {
        System.out.print("Introduce un número entero: ");
        long n=Integer.parseInt(System.console().readLine());
        String dato=digitos(n);
        int l=dato.length();
        int i=0,j=0,k=0;
        String si="", no="";
        for (i=0;i<=9;i++){
            n=Long.parseLong(dato);
            for(j=1;j<=l;j++){
                k=(int)n%10;
                n=n/10;
                if (i==k){
                    si=si+k+" ";
                    j=l;
                }
            }
        }
        for (i=0;i<=9;i++){
            boolean valido=true;
            n=Long.parseLong(dato);
            for(j=1;j<=l;j++){
                k=(int)n%10;
                n=n/10;
                if (k==i){
                    valido=false;
                }
            }
            if (valido){
            no=no+i+" ";
            }
        }
        System.out.printf("Los números que aparecen son: %s%n",si);
        System.out.printf("Los números que no aparecen son: %s%n",no);
    }
}
