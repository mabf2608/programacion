package ejercicios.ejercicio3;

public class pruebaClases {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Ave ave= new Ave();
        Canario Cantarin = new Canario();
        Gato Michi = new Gato();
        Perro Dobby = new Perro();
        Mamifero mamifero = new Mamifero();
        Pinguino PenPen = new Pinguino();
        Lagarto lagarto = new Lagarto();
        
        animal.reproducirse();
        animal.comunicarse();
        animal.defecar();

        ave.alimentaPollito();
        ave.incubar();
        ave.reproducirse();

        Cantarin.defecar();
        Cantarin.alimentaPollito();
        Cantarin.cantarNerviosamente();

        Michi.amamantarCria();
        Michi.arañar();
        Michi.comunicarse();

        Dobby.darALuz();
        Dobby.comunicarse();
        Dobby.ladrar();

        mamifero.darALuz();
        mamifero.amamantarCria();
        mamifero.reproducirse();

        PenPen.alimentaPollito();
        PenPen.incubar();
        PenPen.engullir();

        lagarto.incubar();
        lagarto.morder();
        lagarto.reproducirse();
    }
}
