package ejercicios.ejercicio3;

public class Canario extends Ave{
    @Override
    public void reproducirse(){
        System.out.println("El canario se está reproduciendo.");
    }
    @Override
    public void incubar(){
        System.out.println("El canario está incubando sus huevos.");
    }
    public void cantarNerviosamente(){
        System.out.println("Ten cuidado, puede que hayan gases nocivos en la habitación.");
    }
}
