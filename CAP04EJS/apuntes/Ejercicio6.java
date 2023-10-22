import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println("Cálculo del tiempo de caída de un objeto");
        try {
            float g = 9.81f;
            System.out.println("Por favor, introduzca la altura (en metros) desde la que cae el objeto: ");
            int h = Integer.parseInt(System.console().readLine());
            double t = Math.sqrt(2*h/g);
            if((Double.valueOf(t)).isNaN())
                System.out.println("No es posible calcular el tiempo con una altura negativa");
            else
                System.out.printf("El objeto tarda %.2f segundos en caer.", t);
        } catch(NumberFormatException e){
            System.out.println("Error en la introducción de la altura");
        } 
        catch (Exception e) {
            System.out.println("Error inesperado");
        }
        
        
    }
}
