package ejercicios.ejercicio12;

public class Libro extends Publicacion {
    private boolean prestado;

    protected Libro(String ISBN, String titulo, int año) {
        super(ISBN, titulo, año);
        prestado=false;
    }

    public void setPrestado(boolean prestado){
        this.prestado=prestado;
    }

    public boolean getPrestado(){
        return prestado;
    }

    public String prestado(){
        if(prestado){
            return "(prestado)";
        }else{
            return"(no prestado)";
        }
    }

    public boolean estaPrestado(){
        if (prestado){
            return true;
        }else{
            return false;
        }
    }

    public void presta(){
        if(prestado){
            System.out.println("Lo siento ese libro ya está prestado.");
        }else{
            prestado=true;
        }
    }

    public void devuelve(){
        prestado=false;
    }

    @Override
    public String toString() {
        return String.format("ISBN: %s, título: %s, año de publicación: %d %s", ISBN, titulo, año,  prestado());
    }
}