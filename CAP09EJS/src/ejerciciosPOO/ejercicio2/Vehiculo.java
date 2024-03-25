/*
*Ejercicio 2 | Tema 9
*Implementa la clase vehículo asó como las clases Bicicleta y Coche.
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/

package ejerciciosPOO.ejercicio2;

public abstract class Vehiculo {
    //El modificador static indica que esas variables solo pertenecen a la clase y no a los objetos instanciados
    private static int vehiculosCreados;
    private static int kilometrosTotales;
    private int kilometrosRecorridos;
    
    public Vehiculo(){
        vehiculosCreados++;
    }

    public int getKilometrosRecorridos(){
        return kilometrosRecorridos;
    }

    public void setKilometrosRecorridos(int kilometrosRecorridos){
        this.kilometrosRecorridos=kilometrosRecorridos;
    }
    
    public static int getKilometrosTotales(){
        return kilometrosTotales;
    }

    public static int getVehiculosCreados(){
        return vehiculosCreados;
    }

    public void andar(int km) {
        System.out.printf("%s %d %s", "Andando", km,"kilómetros...");
        this.kilometrosRecorridos += km;
        kilometrosTotales += km;
        System.out.println();
    }

    public static void menu(){
        System.out.println();
        System.out.println("VEHÍCULOS");
        System.out.println("=========");
        System.out.println("1. Anda con la bicicleta");
        System.out.println("2. Haz el caballito con la bicicleta");
        System.out.println("3. Anda con el coche");
        System.out.println("4. Quema rueda con el coche");
        System.out.println("5. Ver kilometraje de la bicicleta");
        System.out.println("6. Ver kilometraje del coche");
        System.out.println("7. Ver kilometraje total y cantidad de vehículos.");
        System.out.println("8. Salir");
        System.out.println("Elige una opción (1-8):");
        System.out.println();
    }
}
