package ejerciciosPOO.ejercicio13;

public class CuentaCorriente {
    public void estableceNumero(){
        for (int i=1; i<=10;i++){
            int digito=(int)(Math.random()*10);
            numero=(numero*10)+digito;
        }
    }

    private long numero=0;
    private double saldo;
    
    public CuentaCorriente(){
        saldo=0;
        estableceNumero();
    }

    public CuentaCorriente(double saldo){
        this.saldo=saldo;
        estableceNumero();
    }

    public void cargo(int gasto){
        saldo-=gasto;
    }

    public void ingreso(int adquiero){
        saldo+=adquiero;
    }

    public void transferencia(CuentaCorriente x, int cantidad){
        saldo-=cantidad;
        x.saldo+=cantidad;
    }

    @Override
    public String toString() {
        return String.format("Número de cta: %d Saldo: %.2f", numero, saldo);
    }
}
