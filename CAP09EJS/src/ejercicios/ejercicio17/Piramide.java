package ejercicios.ejercicio17;

public class Piramide {
    public static int piramidesCreadas;
    private int alt;

    public Piramide(int alt){
        this.alt=alt;
    }

    public void setAlt(int alt){
        this.alt=alt;
    }

    public int getAlt(){
        return alt;
    }

    public static int getPiramidesCreadas(){
        return piramidesCreadas;
    }

    @Override
    public String toString() {
        piramidesCreadas++;
        int i,j;
        String resultado="";

        for (i=1;i<=alt;i++){
            System.out.println();
            resultado="";
            for(j=1;j<=alt-i;j++){
                resultado+=" ";
            }
            for(j=1;j<=(2*i)-1;j++){
                resultado+="*";
            }
        }
        return resultado;
    }
}
