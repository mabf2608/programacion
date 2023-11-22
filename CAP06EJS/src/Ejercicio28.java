/*
*Ejercicio 28 | Tema 6
*HOLA MUNDO con altura aleatoria.
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio28 {
    public static void main(String[] args) {
        int anchura=6,valormax=13,valormin=3,altura=0,i=0,j=0;
        boolean seguir=true;
        while (seguir) {
            altura=(int)(Math.random()*(valormax-valormin+1)+valormin);
            if(altura%2!=0){
                seguir=false;
            }
        }
        int mitad=altura/2+1;
        
        System.out.println();
        for(i=1;i<=altura;i++){
            for(j=1;j<=anchura;j++){
                //pintar h
                if (i==mitad){
                    System.out.print("*");
                }else{
                    if (j==1||j==anchura){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.print("  ");
            for(j=1;j<=anchura;j++){
                if(i>1&&i<altura){
                    if (j==1||j==anchura){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }else{
                    if (j==1||j==anchura){
                        System.out.print(" ");
                    }else{
                        System.out.print("*");
                    }
                }
            }
            System.out.print("  ");
            for(j=1;j<=anchura;j++){
                //pintar l
                if(i>=1&&i<altura){
                    if (j==1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }else{
                    System.out.print("*");
                    
                }
            }
            System.out.print("  ");
            for(j=1;j<=anchura;j++){
                //pintar a
                if (i==mitad){
                    System.out.print("*");
                }else{
                    if(i==1){
                        if (j==1||j==anchura){System.out.print(" ");}
                        else{System.out.print("*");}
                    }else{
                        if (j==1||j==anchura){System.out.print("*");}
                        else{System.out.print(" ");}
                    }
                }
            }
            System.out.println();
        }
    }
}