package ejerciciosPOO.ejercicio3;

public class Lagarto extends Animal {
    @Override
    public void reproducirse(){
        System.out.println("El lagarto se está reproduciendo");
    }
    public void morder(){
        System.out.println("Te ha mordido el lagarto, podría ser venenoso...");
    }
    public void incubar(){
        System.out.println("El lagarto está incubando sus huevos.");
    }
}
