package ejercicios.ejercicio16;

public class Punto {
    private double x;
    private double y;

    public Punto(double x, double y){
        this.x=x;
        this.y=y;
    }

    public double getX(){
        return x;
    }

    public double gety(){
        return y;
    }

    public void setX(double x){
        this.x=x;
    }

    public void setY(double y){
        this.y=y;
    }

    @Override
    public String toString() {
        
        return String.format("%.1f %.1f",x,y);
    }
}
