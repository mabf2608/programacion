/*
*Ejercicio 30 | Tema 6
*Pecera grande
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio30 {
    public static void main(String[] args) {
        System.out.println();
        System.out.print("Por favor, introduzca la altura de la pecera(min4): ");
        int alt=Integer.parseInt(System.console().readLine());
        System.out.print("Ahora introduzca la base de la pecera(min4): ");
        int anch=Integer.parseInt(System.console().readLine());
        System.out.println();
        int npez=(int)(Math.random()*((alt*anch)-((alt*2)+((anch-2)*2)))+1),ncaballito=0,ncaracola=0;
        boolean seguir=true;
        while (seguir) {
            ncaballito=(int)(Math.random()*((alt*anch)-((alt*2)+((anch-2)*2)))+1);
            if (ncaballito!=npez)
                seguir=false;
        }
        seguir=true;
        while (seguir) {
            ncaracola=(int)(Math.random()*((alt*anch)-((alt*2)+((anch-2)*2)))+1);
            if (ncaracola!=ncaballito&&ncaracola!=npez)
                seguir=false;
        }
        int j=0,k=0;
        String animal="  ";
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
                            animal="& ";
                        }
                        if(ncaballito==k){
                            animal="$ ";
                        }
                        if(ncaracola==k){
                            animal="@ ";
                        }
                        System.out.print(animal);
                        animal="  ";
                    }
                }
            }
            System.out.println();
        }
    }
}