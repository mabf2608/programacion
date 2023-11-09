/*
*Ejercicio 51 | Tema 5
*Gusano númerico
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio51 {
    public static String digitos(long v1){
        boolean seguir=true;
        long p = v1;
        String dato1="";
        int i=0;
        while(seguir){
            i=(int)p%10;
            p=p/10;
            dato1=dato1+i;
            if (p<1)
                seguir=false;
        }
        return dato1;
    }
    public static void main(String[] args) {
        System.out.println();
        boolean seguir=true;
        long n=0;
        while (seguir){
            System.out.print("Introduce un número mayor que 0: ");
            n=Integer.parseInt(System.console().readLine());
            if (n<1){
                System.out.println();
                System.out.println("ERROR: Introduce un número válido.");
            }else{
                seguir=false;
            }
        }
        n=Long.parseLong(digitos(n));
        String dato1=digitos(n);
        String dato2="";
        int i=0, j=0;
        int l=dato1.length();
        for(i=1;i<=l;i++){
            j=(int)n%10;
            n=n/10;
            if (j==0 || j==8){
            }else{
                dato2=dato2+j;
            }
        }
        System.out.println();
        if (dato1.length()>dato2.length())
            System.out.printf("Después de haber comido el gusano numérico se queda en: %s%n", dato2);
        else
            System.out.printf("El gusano númerico no se ha comido ningún dígito.%n");
    }
}
