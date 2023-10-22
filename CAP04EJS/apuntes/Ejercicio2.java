public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.printf("Por favor, introduzca una hora del día (0 - 23): ");
        try {
            int hora = Integer.parseInt(System.console().readLine());   
            if(hora<0 || hora>23){
                System.out.println("La hora introducida no es válida");
            }else if((hora>=0 && hora<6) || (hora>20 && hora <=23)){
                System.out.println("Buenos noches");
            } else if(hora>=6 && hora<=12){
                System.out.println("Buenos días");
            }else if(hora>12 && hora<=20){
                System.out.println("Buenos tardes");
            }
        } catch (NumberFormatException e) {
            System.out.println("La hora introducida no es válida");
        } catch(Exception e){
            System.out.println("Se ha producido un error inesperado");
        }
        
    }
}
