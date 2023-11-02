//Realiza un programa que pida primero un número y a continuación un dígito.
//El programa nos debe dar la posición (o posiciones) contando de izquierda a
//derecha que ocupa ese dígito en el número introducido.

public class Ejercicio26 {
    public static void digito(long v1, int v2){
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
        long j=0;
        long n2=Long.parseLong(dato);
        for (i=0 ; i<v2 ; i++){
            j=n2%10;
            n2=n2/10;
        }
        System.out.println();
        System.out.printf("El dígito número %d del número %d es %d",v2,v1,j);
    }
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Introduce un número: ");
        long n = Long.parseLong(System.console().readLine());
        System.out.println("Introduce un dígito de ese número: ");
        int d = Integer.parseInt(System.console().readLine());
        digito(n, d);
    }
}
