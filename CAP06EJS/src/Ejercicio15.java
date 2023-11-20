/*
*Ejercicio 15 | Tema 6
*Melodía
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio15 {
    public static String dato(int v1, String v2){
        switch (v1) {
            case 1:
                v2="do";
            break;
            case 2:
                v2="re";
            break;
            case 3:
                v2="mi";
            break;
            case 4:
                v2="fa";
            break;
            case 5:
                v2="sol";
            break;
            case 6:
                v2="la";
            break;
            case 7:
                v2="si";
            break;
            default:
                break;
        }
        return v2;
    }
    public static void main(String[] args) {
        System.out.println();
        boolean seguir=true;
        int l=0;
        while (seguir) {
            l=(int)(Math.random()*25+4);
            if (l%4==0)
                seguir=false;
        }
        int nota=0;
        String dat="",aux="";
        for(int i=1;i<=l;i++){
            nota=(int)(Math.random()*7+1);
            if(i==1)
                aux=dato(nota,dat);
            if(i==l){
                System.out.print(aux+" ");
                System.out.print("||");
            }else{
                System.out.print(dato(nota,dat)+" ");
                if(i%4==0)
                    System.out.print("| ");
            }
        }
        System.out.println();
    }
}