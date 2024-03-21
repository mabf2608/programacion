package ejercicios.ejercicio16;

public class Linea {
    Punto p1;
    Punto p2;

    public Linea(Punto p1, Punto p2){
        this.p1=p1;
        this.p2=p2;
    }

    public Punto getP1(){
        return p1;
    }

    public Punto getP2(){
        return p2;
    }

    public void setP1(Punto p1){
        this.p1=p1;
    }

    public void setP2(Punto p2){
        this.p2=p2;
    }

    @Override
    public String toString() {
        
        return String.format("Línea formada por los puntos (%s y %s)", p1, p2);
    }
}
