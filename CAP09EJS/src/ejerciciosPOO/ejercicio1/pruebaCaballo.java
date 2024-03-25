package ejerciciosPOO.ejercicio1;

public class pruebaCaballo {
    public static void main(String[] args) {
        System.out.println();
        Caballo Perdigon = new Caballo("marrón", "árabe", "Perdigón", 8);
        System.out.println(Perdigon.dimeDatosCaballo());
        Perdigon.correr();
        Perdigon.caballoCome();
    }
}   
