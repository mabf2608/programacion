/*
*Ejercicio 20 | Tema 6
*Cuba de agua
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio20 {
    public static final String RESET="\033[0m";
    public static final String BLUE_BACKGROUND="\033[44m";
    public static void main(String[] args) {
        System.out.println();
        System.out.print("Introduzca la capacidad de la cuba en litros: ");
        int cap=Integer.parseInt(System.console().readLine());
        cap+=1;
        int anch=6,j=0,litros=(int)(Math.random()*cap),dif=cap-litros;
        for(int i=1;i<=cap;i++){
            if (i<cap){
                for(j=1;j<=anch;j++){
                    if (j==1||j==anch){
                        System.out.print("#");
                    }else{
                        if (i>=dif){
                            System.out.print(BLUE_BACKGROUND+" ");
                            System.out.print(RESET);
                        }else{
                            System.out.print(" ");
                        }
                    }
                }
            }else{
                for(j=1;j<=anch;j++){
                    System.out.print("#");
                }
            }
            System.out.println();
        }
        System.out.printf("La cuba tiene una capacidad de %d y contiene %d litros de agua.%n",cap-1,litros);
    }
}
