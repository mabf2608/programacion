package ejercicios.ejercicio3;

public class Mamifero extends Animal {
    @Override
    public void reproducirse(){
        System.out.println("El mamífero se está reproduciendo.");
    }
    public void amamantarCria(){
        System.out.println("El mamífero está amamantando a su cría.");
    }
    public void darALuz(){
        System.out.println("El mamífero está dando a luz.");
    }
}
