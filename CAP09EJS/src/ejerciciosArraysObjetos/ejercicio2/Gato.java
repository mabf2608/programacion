package ejerciciosArraysObjetos.ejercicio2;

public class Gato {
    private String nombre;
    private int patas;
    private String color;

    public Gato(String nombre, int patas, String color){
        this.nombre=nombre;
        this.patas=patas;
        this.color=color;
    }

    @Override
    public String toString() {
        return String.format("El nombre del gato es %s, tiene %d patas y es de color %s.", nombre, patas, color);
    }
}
