/*Realiza una programa que calcule las horas transcurridas entre dos horas de
dos días de la semana. No se tendrán en cuenta los minutos ni los segundos.
El día de la semana se puede pedir como un número (del 1 al 7) o como una
cadena (de “lunes” a “domingo”). Se debe comprobar que el usuario introduce
los datos correctamente y que el segundo día es posterior al primero.

EJEMPLO:
Por favor, introduzca la primera hora.
Día: lunes
Hora: 18
Por favor, introduzca la segunda hora.
Día: martes
Hora: 20
Entre las 18:00h del lunes y las 20:00h del martes hay 26 hora/s.
*/

public class Ejercicio30 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Por favor, introduzca la primera hora (sin minutos): ");
        System.out.print("Día: ");
        String d1 = System.console().readLine();
        System.out.print("Hora: ");
        int h1 = Integer.parseInt(System.console().readLine());
        System.out.println("Por favor, introduzca la segunda hora (sin minutos): ");
        System.out.print("Día: ");
        String d2 = System.console().readLine();
        System.out.print("Hora: ");
        int h2 = Integer.parseInt(System.console().readLine());
        

    }
}
