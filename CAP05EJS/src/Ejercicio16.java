public class Ejercicio16 {
    public static void main(String[] args) {
        System.out.println();
        System.out.print("Introduce un número para saber si es primo o no: ");
        int n = Integer.parseInt(System.console().readLine());
        int i;
        int salida = 0;
        for (i = 2; i <= n/2 && salida == 0;i++){
            if(n%i != 0){
            }else{
                salida = 1;
            }
        }
        System.out.println();
        if (salida == 1){
            System.out.printf("El número %d no es primo.%n",n);
        }else{
            System.out.printf("El número %d es primo.%n",n);
        }
    }
}
