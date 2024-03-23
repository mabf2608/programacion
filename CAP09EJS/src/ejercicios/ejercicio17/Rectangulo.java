package ejercicios.ejercicio17;

public class Rectangulo {
    private int alt, bas;
    public static int rectangulosCreados;

    public Rectangulo(int bas, int alt){
        this.alt=alt;
        this.bas=bas;
    }

    public void setAlt(int alt){
        this.alt=alt;
    }

    public void setBas(int bas){
        this.bas=bas;
    }

    public int getAlt(){
        return alt;
    }

    public int getBas(){
        return bas;
    }

    public static int getRectangulosCreados(){
        return rectangulosCreados;
    }

    @Override
    public String toString() {
        rectangulosCreados++;
        int i,j;
        String resultado="";

        for (i=1;i<=alt;i++){
            for(j=1;j<=bas;j++){
                resultado+="*";
            }
            resultado+="\n";
        }
        return resultado;
    }
}
