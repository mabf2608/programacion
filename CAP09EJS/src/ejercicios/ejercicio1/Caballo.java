/*
*Ejercicio 1 | Tema 9
*Implementa la clase caballo vista anteriormente.
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/

package ejercicios.ejercicio1;

public class Caballo {
    private final int patas = 4;
    private String color;
    private String raza;
    private String nombre;
    private int carrerasGanadas;

    public Caballo(String color, String raza, String nombre, int carrerasGanadas){
        this.nombre=nombre;
        this.color=color;
        this.raza=raza;
        this.carrerasGanadas=carrerasGanadas;
    }
    
    public void correr(){
        System.out.println("El caballo "+nombre+" está corriendo.");
    }

    public void defecar(){
        System.out.println("El caballo "+nombre+" está defecando.");
    }

    public void miccionar(){
        System.out.println("El caballo "+nombre+" está miccionando");
    }

    public void revolcarse(){
        System.out.println("El caballo "+nombre+"está revolcándose por el suelo.");
    }

    public void caballoCome(){
        if(this.dimeRaza().toLowerCase().equals("pinto")){
            System.out.println("No hace falta comer.");
        }else{
            System.out.println("Trae para acá ÑAM ÑAM");
        }
    }
    //GETTER
    public String dimeDatosCaballo(){
        return "El nombre del caballo es "+nombre+", su raza es "+raza+", tiene "+patas+" patas y su color es "+color+", por último ha ganado un total de "+carrerasGanadas+" carreras.";
    }

    public String dimeCarrerasGanadas(){
        return "Ha ganado un total de "+carrerasGanadas+" carreras.";
    }

    public String dimeRaza(){
        return raza;
    }

    //SETTER
    public void estableceRaza(String razaCaballo){
        raza=razaCaballo;
    }

    public void estableceColor(String colorCaballo){
        color=colorCaballo;
    }

    public void estableceCarreras(int carrerasCaballo){
        carrerasGanadas=carrerasCaballo;
    }
}