public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
        System.out.println("Por favor, introduzca el valor de a: ");
        try {
            float a = Float.parseFloat(System.console().readLine());
            System.out.println("Ahora introduzca el valor de b:");
            float b = Float.parseFloat(System.console().readLine());
            float x = -b/a;
            System.out.printf("x = %.2f", x);    
        } catch (NumberFormatException e){
            System.out.println("Error en la introucción de los datos de la ecuación");
        } 
        catch(ArithmeticException e){
            System.out.println("La ecuación no tiene solución");
        } catch (Exception e) {
            System.out.println("Error inesperado");
        }
        

    }
    
}
