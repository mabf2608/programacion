package ejercicios.ejercicio3;

public class Perro extends Mamifero {
    @Override
    public void reproducirse(){
        System.out.println("El perro se está reproduciendo... GUAU");
    }
    @Override
    public void amamantarCria(){
        System.out.println("La perra está amamantando a sus perretes.");
    }
    public void ladrar(){
        System.out.println("El perro está ladrandote, CUIDADO.");
    }
}
