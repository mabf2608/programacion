import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        try {
            
        
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la hora que es sin minutos (1 al 24): ");
        int hora = sc.nextInt();

        if (hora>=6 && hora<=12){
        System.out.println("Buenos días.");
        }else{
            if (hora>=13 && hora<=20){
                System.out.println("Buenas tardes.");
            }else{
                if ((hora>=21 && hora<=24)||(hora>=1 && hora<=5)){
                System.out.println("Buenas noches.");
                }else{
                    System.out.println("ERROR: Valor introducido incorrecto, debe ser del 1 al 24.");
                }
            }
        }
    sc.close();
        } catch (NumberFormatException e){
            System.out.println("No has introducido una hora.");
        }catch (Exception e) {
            System.out.println("Se ha producido un error inesperado.");
        }
    }
}
