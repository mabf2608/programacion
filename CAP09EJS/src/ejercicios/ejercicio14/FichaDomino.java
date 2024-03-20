package ejercicios.ejercicio14;

public class FichaDomino {

    private int lado1;
    private int lado2;

    public FichaDomino(int lado1, int lado2){
        this.lado1=lado1;
        this.lado2=lado2;
    }

    public String voltea(){
        int aux=lado1;
        lado1=lado2;
        lado2=aux;
        return toString();
    }

    public boolean encaja(FichaDomino x){
        if(lado2 == x.lado1){
            return true;
        }else if (lado1 == x.lado2){
            return true;
        }else if (lado2 == x.lado2){
            return true;
        }else if (lado1 == x.lado1){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        String resultado = null;
        if(lado1 == 0){
            resultado = String.format("[%s|%d]"," ", lado2 );
        }else if(lado2 == 0){
            resultado = String.format("[%d|%s]",lado1, " " );
        }else{
            resultado = String.format("[%d|%d]",lado1, lado2 );
        }
        return resultado;
    }
}