/*
*Ejercicio 32 | Tema 6
*Camino
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio32 {
    public static boolean probabilidad(){
        boolean hayobstaculo=true;
        int posibilidad=(int)(Math.random()*10+1) ;
        if (posibilidad > 5)
            hayobstaculo=false;
        return hayobstaculo;
    }
    public static Integer desviacion(int esp){
        int desviacion=(int)(Math.random()*3+1);
            if (desviacion==1)
                esp-=1;
            if (desviacion==3)
                esp+=1;
        return esp;
    }
    public static void main(String[] args) {
        System.out.println();
        System.out.print("Introduzca la longitud del sendero: ");
        int longsendero=Integer.parseInt(System.console().readLine());
        int j=0,k=0,esp=6,anchura=6;
        System.out.println();
        for(int i=1;i<=longsendero;i++){
            for(j=1;j<=esp;j++){
                System.out.print(" ");
            }
            boolean hayobstaculo=probabilidad();
            String tipo="";
            k=(int)(Math.random()*3+2);
            for(j=1;j<=anchura;j++){
                if (j==1||j==anchura){
                    System.out.print("|");
                }else{
                    if (hayobstaculo && k==j){
                        tipo=Math.random() <= 0.5 ? "*" : "O";
                    }else{
                        tipo=" ";
                    }
                    System.out.print(tipo);
                }
            }
            esp=desviacion(esp);
            System.out.println();
        }
    }
}
