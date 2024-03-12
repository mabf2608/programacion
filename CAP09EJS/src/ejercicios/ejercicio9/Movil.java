package ejercicios.ejercicio9;

public class Movil extends Terminal {

    private String tarifa;
    private int costeMinuto;
    private float segundosLlamados;

    public void estableceTarifa(String tarifa){
        this.tarifa=tarifa;
        if (tarifa.toLowerCase().equals("rata")){
            costeMinuto=6;
        }else if(tarifa.toLowerCase().equals("mono")){
            costeMinuto=12;
        }else if(tarifa.toLowerCase().equals("bisonte")){
            costeMinuto=30;
        }
    }

    public Movil(String numero, String tarifa) {
        super(numero);
        estableceTarifa(tarifa);
    }

    public void setTarifa(String tarifa){
        this.tarifa=tarifa;
    }

    public String getTarifa(String tarifa){
        return tarifa;
    }

    public void llama(Movil x, int seg){
        this.segundosConversacion+=seg;
        segundosLlamados+=(float)seg;
        x.segundosConversacion+=seg;
    }

    @Override
    public String toString() {
        return String.format("Nº %s - tarifa %s - %ds de conversación - tarificados %.2f euros", numero, tarifa, segundosConversacion,(float)(((segundosLlamados/60)*costeMinuto
        )/100));
    }
}
