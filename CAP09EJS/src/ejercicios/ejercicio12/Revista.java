package ejercicios.ejercicio12;

public class Revista extends Publicacion {

    private int numero;

    protected Revista(String ISBN, String titulo, int año, int numero) {
        super(ISBN, titulo, año);
        this.numero=numero;
    }

    public int getNumero(){
        return numero;
    }

    public void setNumero(int numero){
        this.numero=numero;
    }
}
