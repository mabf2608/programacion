public class Ejercicio36 {
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
        try{
            System.out.println();
            System.out.print("Introduce un número entero positivo para saber si es capicúa: ");
            long n = Long.parseLong(System.console().readLine());
            long d = Long.parseLong(digitos(n));
            if (n<0)
                System.out.print("ERROR: El número debe ser positivo.");
            else
                if (n==d)
                    System.out.printf("El %d es un número capicúa. ",n);
                else
                    System.out.printf("El %d no es un número capicúa. ",n);
            System.out.println();
        }catch(Exception e){
            System.out.println("ERROR: Debes introducir un número entero positivo.");
        }
    }
}
