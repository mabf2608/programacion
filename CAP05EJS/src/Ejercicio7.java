public class Ejercicio7 {
    public static void main(String[] args) {
    System.out.println();
    System.out.println("Introduce un número de 4 cifras positivo para intentar abrir la caja fuerte.");
    int n = 1474;
    int salida = 4;
    int i;
    while(salida != 0){
    if (salida == 4){
        System.out.print("Primer intento: ");
        i = Integer.parseInt(System.console().readLine());
        if (i < 1000 || i > 9999){
        System.out.println("ERROR: Número introducido no válido, introduce uno de 4 cifras la proxima vez.");
        salida--;
        System.out.println();
        }else{
        if (i == n){
            System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
            salida = 0;
        }else{
            System.out.println("Lo siento, esa no es la combinación. Te quedan 3 intentos.");
            salida--;
            System.out.println();}}
        }else{
            if (salida == 3){
                System.out.print("Segundo intento: ");
                i = Integer.parseInt(System.console().readLine());
                if (i < 1000 || i > 9999){
                    System.out.println("ERROR: Número introducido no válido, introduce uno de 4 cifras la proxima vez.");
                    salida--;
                    System.out.println();
                }else{
                if (i == n){
                    System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
                    salida = 0;
                }else{
                    System.out.println("Lo siento, esa no es la combinación. Te quedan 2 intentos.");
                    salida--;
                    System.out.println();}
                }
        }else{
            if (salida == 2){
                System.out.print("Tercer intento: ");
                i = Integer.parseInt(System.console().readLine());
                if (i < 1000 || i > 9999){
                    System.out.println("ERROR: Número introducido no válido, introduce uno de 4 cifras la proxima vez.");
                    salida--;
                    System.out.println();
                }else{
                if (i == n){
                    System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
                    salida = 0;
                }else{
                    System.out.println("Lo siento, esa no es la combinación. Te queda 1 intento.");
                    salida--;
                    System.out.println();}
                }
        }else{
            if (salida == 1){
                System.out.print("Último intento: ");
                i = Integer.parseInt(System.console().readLine());
                if (i < 1000 || i > 9999){
                    System.out.println("ERROR: Número introducido no válido, introduce uno de 4 cifras la proxima vez...");
                    salida--;
                }else{
                if (i == n){
                    System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
                    salida = 0;
                }else{
                    System.out.println("Lo siento, esa no es la combinación. Te has quedado sin intentos...");
                    salida = 0;}
                            }
                        }
                    }
                }
            }
        }
    }
}
