public class Ejercicio60 {
    public static void main(String[] args) {
        System.out.println();
        int a=0;
        boolean seguir=true;
        while (seguir) {
            System.out.print("Introduce la altura de los calcetines: ");
            a=Integer.parseInt(System.console().readLine());
            if(a>=4){
                seguir=false;
            }
            else{
                System.out.println();
                System.out.println("ERROR: Introduce un altura mayor que 4.");
                System.out.println();
            }
        }
        int i=0,j=0,k=0,anch=3,esp=2;
        for(i=1;i<=a;i++){
            System.out.println();
            if (i<=a-2){
                for(j=1;j<=anch;j++){
                    System.out.print("*");
                }
            }else{
                for(j=1;j<=anch*2;j++){
                    System.out.print("*");
                }
            }
            if (i<=a-2){
                for(j=1;j<=anch+esp;j++){
                    System.out.print(" ");
                }
                for(j=1;j<=anch;j++){
                    System.out.print("*");
                }
            }else{
                for(j=1;j<=esp;j++){
                    System.out.print(" ");
                }
                for(j=1;j<=anch*2;j++){
                    System.out.print("*");
                }
            }
        }
        System.out.println();
    }
}