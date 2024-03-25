package ejerciciosPOO.ejercicio11;

public class TarjetaRegalo {

    public void estableceNumero(){
        for(int i =1;i<=5;i++){
            int digito=(int)(Math.random()*10);
            numero+=digito;
        }
    }

    private double saldo;
    private String numero="";

    public TarjetaRegalo(double saldo) throws Exception{
        if (saldo>0){
            this.saldo=saldo;
            estableceNumero();
        }else{
            throw new Exception("Introduzca un saldo positivo.");
        }
    }

    public TarjetaRegalo() throws Exception{
        throw new Exception("Utilice el constructor con parámetros.");
    }

    public TarjetaRegalo fusionaCon(TarjetaRegalo x) throws Exception{
        TarjetaRegalo aux=new TarjetaRegalo(this.saldo + x.saldo);
        this.saldo=0;
        x.saldo=0;
        return aux;
    }

    public void setSaldo(double saldo){
        this.saldo=saldo;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setNumero(String numero){
        this.numero=numero;
    }

    public String getNumero(String numero ){
        return numero;
    }

    public void gasta(double cantidad){
        if (saldo>=cantidad){
            saldo-=cantidad;
        }else{
            System.out.printf("No tiene suficiente saldo para gastar %.2f€%n", cantidad);
        }
    }
    
    @Override
    public String toString() {
        return String.format("Tarjeta nº %s - Saldo %.2f€",numero, saldo);
    }
}
