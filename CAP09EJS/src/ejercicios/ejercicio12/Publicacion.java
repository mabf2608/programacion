package ejercicios.ejercicio12;

public class Publicacion {
    protected String ISBN, titulo;
    protected int año;

    protected Publicacion(String ISBN, String titulo, int año){
        this.ISBN=ISBN;
        this.año=año;
        this.titulo=titulo;
    }

    protected void setISBN(String ISBN){
        this.ISBN=ISBN;
    }

    protected void setAño(int año){
        this.año=año;
    }

    protected void setTitulo(String titulo){
        this.titulo=titulo;
    }

    protected String getISBN(){
        return ISBN;
    }

    protected int getAño(){
        return año;
    }

    protected String getTitulo(){
        return titulo;
    }

    public String toString() {
        return String.format("ISBN: %s, título: %s, año de publicación: %d", ISBN, titulo, año);
    }
}
