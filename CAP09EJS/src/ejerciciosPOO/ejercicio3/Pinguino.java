package ejerciciosPOO.ejercicio3;

public class Pinguino extends Ave {
    @Override
    public void reproducirse(){
        System.out.println("El pingüino se está reproduciendo.");
    }
    @Override
    public void incubar(){
        System.out.println("El pingüino está incubando sus huevos.");
    }
    public void engullir(){
        System.out.println("El pingüino ha engullido la comida, ya que no mastica.");
    }
}
