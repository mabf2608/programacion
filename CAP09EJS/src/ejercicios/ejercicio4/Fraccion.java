package ejercicios.ejercicio4;

public class Fraccion{
    private int numerador;
    private int denominador;

    private static int maximo(int n, int x) {
        return (n < x) ? n : x; // Si n es menor que x, devuelve n; de lo contrario, devuelve x.
    }

    public String getNumerador(){
        return "El numerador es: "+numerador;
    }

    public String getDenominador(){
        return "El denominador es: "+denominador;
    }

    public void setNumerador(int numerador){
        this.numerador=numerador;
    }

    public void setDenominador(int denominador){
        this.denominador=denominador;
    }

    public Fraccion(int numerador, int denominador){
        this.numerador=numerador;
        this.denominador=denominador;
    }

    public void invertir(){
        int aux=numerador;
        numerador=denominador;
        denominador=aux;
    }

    public int multiplicar(){
        return numerador*denominador;
    }

    public int dividir(){
        return numerador/denominador;
    }

    public void simplificar(){
        int numMax=maximo(numerador, denominador);

        for(int i=numMax/2;i>=2;i--){
            if((numerador%i)==0 && (denominador%i)==0){
                numerador/=i;
                denominador/=i;
            }
        }
    }

    @Override
    public String toString() {
        return String.format("%nEl numerador es: %d%nEl denominador es: %d",numerador,denominador);
    }
}