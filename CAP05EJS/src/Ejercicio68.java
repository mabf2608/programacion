/*
*Ejercicio 68 | Tema 5
*Dislocar numero
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio68 {
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
    public static long DislocarNum(long num){
        String longitud = num + "";
        String alreves = "";
        int longitudnum = longitud.length();
        for(int i = 1;i<=longitudnum;i++ ){
            int digito = (int)num%10;
            num = num/10;
            if(digito%2==0){
                digito+=1;
            }else{
                digito-=1;
            }
            alreves = alreves + digito;
        }
        num = Long.parseLong(alreves);
        return Long.parseLong(digitos(num));
    }
    public static void main(String[] args) {
        System.out.println();
        System.out.print("Introduzca un número para que sea dislocado: ");
        long n=Long.parseLong(System.console().readLine());
        System.out.printf("Dislocando el número %d sale el número %d.",n,DislocarNum(n));
        System.out.println();
    }
}
