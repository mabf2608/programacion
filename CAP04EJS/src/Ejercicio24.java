public class Ejercicio24 {
    public static void main(String[] args) {
        try{
            System.out.println();
            System.out.println("1.- Programador Junior.");
            System.out.println("2.- Prog. senior.");
            System.out.println("3.- Jefe Proyecto.");
            System.out.println();
            System.out.println("Introduce el cargo del empleado (1, 2 o 3): ");
            int n = Integer.parseInt(System.console().readLine());
            System.out.println("¿Cuántos días ha estado de viaje visitando clientes?: ");
            int dias = Integer.parseInt(System.console().readLine());
            int viajedin = dias * 30;
            System.out.println("Introduzca su estado civil (1.- Soltero, 2.- Casado): ");
            int estado = Integer.parseInt(System.console().readLine());
            float irpf;
            String i;
            if (estado == 1){
                irpf = (float)0.25;
                i="(25%)";
            }else{
                irpf = (float)0.2;
                i="(20%)";
            }
            float sueldo;
            switch (n){
                case 1:
                break;

                case 2:
                break;

                case 3:
                break;

                default:
                break;
            }






        }catch (Exception e){

        }
    }
}
