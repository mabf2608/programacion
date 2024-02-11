package ejercicios.ejercicio3;

public class Gato extends Mamifero{
    @Override
    public void reproducirse(){
        System.out.println("El gato se está reproduciendo... MIAU");
    }
    @Override
    public void amamantarCria(){
        System.out.println("La gata está amamantando a sus gatitos.");
    }
    public void arañar(){
        System.out.println("El gato está arañando.");
    }
}
