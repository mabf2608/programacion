/*
*Ejercicio 17 | Tema 6
*Pecera
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio17 {
    public static void main(String[] args) {
        System.out.println();
        System.out.print("Por favor, introduzca la altura de la pecera(min4): ");
        int alt=Integer.parseInt(System.console().readLine());
        System.out.print("Ahora introduzca la base de la pecera(min4): ");
        int anch=Integer.parseInt(System.console().readLine());
        System.out.println();
        int j=0,k=0,npez=(int)(Math.random()*((alt*anch)-((alt*2)+((anch-2)*2)))+1);
        String pez="";
        
        for (int i=1;i<=alt;i++){
            if(i==1||i==alt){
                for(j=1;j<=anch;j++){
                    System.out.print("* ");
                }
            }else{
                for(j=1;j<=anch;j++){
                    if (j==1||j==anch){
                        System.out.print("* ");
                    }else{
                        k++;
                        if(npez==k){
                            pez="& ";
                        }else{
                            pez="  ";
                        }
                        System.out.print(pez);
                    }
                }
            }
            System.out.println();
        }
    }
}