package ejerciciosPOO.ejercicio8;

public class Terminal {
    private int segundosConversacion;
    private String numero;

    public Terminal(String numero){
        this.numero=numero;
    }

    public void llama(Terminal x, int seg){
        this.segundosConversacion+=seg;
        x.segundosConversacion+=seg;
    }

    public String getNumero(){
        return numero;
    }

    public void setNumero(String num){
        numero=num;
    }

    public void setSegundosConversacion(int seg){
        segundosConversacion=seg;
    }

    public int getSegundosConversacion(){
        return segundosConversacion;
    }
    @Override
    public String toString() {
        return String.format("Nº %s - %ds de conversación.",numero,segundosConversacion);
    }
}
