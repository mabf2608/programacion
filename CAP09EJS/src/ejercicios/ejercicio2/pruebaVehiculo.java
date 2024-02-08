package ejercicios.ejercicio2;

public class pruebaVehiculo {
    public static void main(String[] args) {
        Bicicleta b1=new Bicicleta();
        Coche c1=new Coche();
        boolean salida=false;
        int opcion=0;
        while(!salida){
            Vehiculo.menu();
            opcion=Integer.parseInt(System.console().readLine());
            switch (opcion) {
                case 1:
                    b1.andar(50);
                    break;
                case 2:
                    b1.haciendoCaballito();
                    break;
                case 3:
                    c1.andar(400);
                    break;
                case 4:
                    c1.quemaRueda();
                    break;
                case 5:
                    System.out.println(b1.getKilometrosRecorridos());
                    break;
                case 6:
                    System.out.println(c1.getKilometrosRecorridos());
                    break;
                case 7:
                    System.out.println(Vehiculo.getKilometrosTotales());
                    System.out.println(Vehiculo.getVehiculosCreados());
                    break;
                case 8:
                    System.out.println("Gracias por tu ayuda, nos vemos pronto");
                    salida=true;
                    break;
            
                default:
                    System.out.println("ERROR: Introduce un valor válido.");
                    break;
            }
        }
        
    }
}
