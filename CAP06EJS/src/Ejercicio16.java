/*
*Ejercicio 16 | Tema 6
*Tragaperras
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio16 {
    public static String dato(int v1, String v2){
        switch (v1) {
            case 1:
                v2="corazón";
            break;
            case 2:
                v2="diamante";
            break;
            case 3:
                v2="herradura";
            break;
            case 4:
                v2="campana";
            break;
            case 5:
                v2="limón";
            break;
            default:
                break;
        }
        return v2;
    }
    public static void main(String[] args) {
        System.out.println();
        int fig1=(int)(Math.random()*5+1),fig2=(int)(Math.random()*5+1),fig3=(int)(Math.random()*5+1);
        String dat1="",dat2="",dat3="";
        String figura1=dato(fig1, dat1),figura2=dato(fig2, dat2),figura3=dato(fig3, dat3);
        System.out.printf("Tirada: %s %s %s ",figura1,figura2,figura3);
        System.out.println();
        System.out.println();
        if(figura1.equals(figura2)&&figura2.equals(figura3)){
            System.out.println("Enhorabuena, ha ganado 10 monedas.");
        }else{
            if(figura1.equals(figura2)||figura2.equals(figura3)||figura3.equals(figura1)){
                System.out.println("Bien, ha recuperado su moneda");
            }else{
                System.out.println("Lo siento, ha perdido.");
            }
        }
    }
}