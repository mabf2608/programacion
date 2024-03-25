package ejerciciosPOO.ejercicio10;

public class Ameba {
    private int peso;

    public Ameba(){
        peso=3;
    }

    public void come(int cantidad){
        peso+=cantidad-1;
    }

    public void come(Ameba x){
        peso+=x.peso-1;
        x.peso=0;
    }

    @Override
    public String toString() {
        return String.format("Soy una ameba y peso %d microgramos.", peso);
    }
}
