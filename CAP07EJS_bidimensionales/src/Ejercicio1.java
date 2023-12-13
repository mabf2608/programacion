public class Ejercicio1{
    public static void crear_tabla(int[][] num){
        System.out.println();
        int i;
        int j;
        String columna="Columna";
        for(i=-1;i<=2;i++){
            for(j=-1;j<=5;j++){
                if (i==-1&&j==0){
                    System.out.printf("%18s %d",columna,j);
                }
                if (i==-1&&j>0){
                    System.out.printf("%10s %d",columna,j);
                }
                if (i>=0&&j==-1){
                    System.out.printf("Fila %d",i);
                }
                if (i>=0&&j==0){
                    System.out.printf("%11d",num[i][j]);
                }
                if(i>=0&&j>0){
                        System.out.printf("%12d",num[i][j]);
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] num = new int[3][6];
        num[0][0]=0;
        num[0][1]=30;
        num[0][2]=2;
        num[0][5]=5;
        num[1][0]=75;
        num[1][4]=0;
        num[2][2]=-2;
        num[2][3]=9;
        num[2][5]=11;
        crear_tabla(num);
    }
}