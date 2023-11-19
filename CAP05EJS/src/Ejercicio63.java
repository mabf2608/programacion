/*
*Ejercicio 63 | Tema 5
*Dos piramides
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio63 {
    public static void main(String[] args) {
        System.out.println("Introduce la altura de la primera piramide: ");
        int a1=Integer.parseInt(System.console().readLine());
        System.out.println("Introduce la altura de la segunda piramide: ");
        int a2=Integer.parseInt(System.console().readLine());
        int anchtotala1=2*a1-1;
        int anchtotala2=2*a2-1;
        int dif=Math.abs(a1-a2);
        int i=0,j=0;
        if (a1>a2){
            for(i=1;i<=a1;i++){
                System.out.println();
                for(j=1;j<=a1-i;j++){
                    System.out.print(" ");
                }
                for(j=1;j<=2*i-1;j++){
                    System.out.print("*");
                }
                for(j=1;j<=a1-i+1;j++){
                    System.out.print(" ");
                }
                if (i-dif>0){
                    for(j=1;j<=a2-(i-dif)+1;j++){
                        System.out.print(" ");
                    }
                    for(j=1;j<=2*(i-dif)-1;j++){
                        System.out.print("*");
                    }
                }else{
                    for(j=-dif;j<=anchtotala2+1;j++){
                        System.out.print(" ");
                    }
                }
            }
        }
        if(a1<a2){
            for(i=1;i<=a2;i++){
                System.out.println();
                if (i-dif>0){
                    for(j=1;j<=a1-(i-dif)+1;j++){
                        System.out.print(" ");
                    }
                    for(j=1;j<=2*(i-dif)-1;j++){
                        System.out.print("*");
                    }
                    for(j=1;j<=a1-(i-dif)+1;j++){
                        System.out.print(" ");
                }   
                }else{
                    for(j=-dif;j<=anchtotala1+1-dif;j++){
                        System.out.print(" ");
                    }
                }
                for(j=1;j<=a2-i+1;j++){
                    System.out.print(" ");
                }
                for(j=1;j<=2*i-1;j++){
                    System.out.print("*");
                }
            }
        }
        if(a1==a2){
            for(i=1;i<=a1;i++){
                System.out.println();
                for(j=1;j<=a1-i;j++){
                    System.out.print(" ");
                }
                for(j=1;j<=2*i-1;j++){
                    System.out.print("*");
                }
                for(j=1;j<=a1-i+1;j++){
                    System.out.print(" ");
                }
                for(j=1;j<=a2-i;j++){
                    System.out.print(" ");
                }
                for(j=1;j<=2*i-1;j++){
                    System.out.print("*");
                }
                for(j=1;j<=a2-i+1;j++){
                    System.out.print(" ");
                }
            }
        }
    }
}
