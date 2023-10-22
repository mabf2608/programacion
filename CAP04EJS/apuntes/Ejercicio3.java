public class Ejercicio3 {
    public static String diaDeLaSemana(int dia){
        switch (dia) {
            case 1:
                return "Lunes";
            case 2:
                return "Martes";
            case 3:
                return "Miércoles";
            case 4:
                return "Jueves";
            case 5:
                return "Viernes";
            case 6:
                return "Sábado";
            case 7:
                return "Domingo";
            default:
                return "El día introducido no es correcto";
        }
    }
    public static void main(String[] args) {
        System.out.println("Por favor, introduzca un número del 1 al 7: ");
        try {
            int dia = Integer.parseInt(System.console().readLine());  
            
            System.out.println(diaDeLaSemana(dia));

        }catch(NumberFormatException e){
            System.out.println("El día introducido no es correcto");
        } 
        catch (Exception e) {
            System.out.println("Se ha producido un error inesperado");
        }
    }
    
}
