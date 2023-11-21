/*
*Ejercicio 26 | Tema 6
*Bocado en tableta de chocolate
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio26 {
    public static final String RESET = "\033[0m";
    public static final String GREEN_BACKGROUND = "\033[42m";
    public static int Columna(int columnaaleatoria, int anchura){
        switch (columnaaleatoria) {
            case 1:
                return columnaaleatoria=1;
            case 2:
                return columnaaleatoria=anchura;
            default:
                return columnaaleatoria;
        }
    }
    public static void main(String[] args) {
        System.out.println();
        System.out.print("Introduce la altura de la tableta: ");
        int altura=Integer.parseInt(System.console().readLine());
        System.out.print("Introduce la anchura de la tableta: ");
        int anchura=Integer.parseInt(System.console().readLine());
        int i=0,j=0;
        int filaaleatoria=(int)(Math.random()*altura+1);
        int columnaaleatoria;

        if (filaaleatoria>1&&filaaleatoria<altura){
            columnaaleatoria=Columna((int)(Math.random()*2+1),anchura);
        }else{
            columnaaleatoria=(int)(Math.random()*anchura+1);
        }
        System.out.println();
        for(i=1;i<=altura;i++){
            for(j=1;j<=anchura;j++){
                if(i==filaaleatoria&&j==columnaaleatoria){
                    System.out.print(" ");
                }else{
                    System.out.print(GREEN_BACKGROUND);
                    System.out.print("=");
                    System.out.print(RESET);
                }
            }
            System.out.println();
        }
    }
}
