package ejerciciosPOO.ejercicio3;

public class Ave extends Animal {
    @Override
    public void reproducirse(){
        System.out.println("El ave está reproduciendose.");
    }
    public void incubar(){
        System.out.println("El ave está incubando sus huevos.");
    }
    public void alimentaPollito(){
        System.out.println("El ave está alimentando a su cría.");
    }
}
