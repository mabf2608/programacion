/*Realiza un programa que pinte una X hecha de asteriscos. El programa debe
pedir la altura. Se debe comprobar que la altura sea un número impar mayor o
igual a 3, en caso contrario se debe mostrar un mensaje de error.*/
public class Ejercicio35 {
    public static void main(String[] args) {
        boolean seguir = true;
        int a=0;
        while(seguir){
            System.out.println();
            System.out.print("Introduce la altura de la X: ");
            a = Integer.parseInt(System.console().readLine());
            if(a%2==0 || a<=3){
                System.out.println();
                System.out.println("ERROR, Vuelva a introducir la altura.");
            }else{
                seguir=false;
            }
        }
        seguir=true;
        while(seguir){
            int i=0,j=0,k=0,h=0;
            char ast='*',esp=' ';
            for(i=a;i>=1;i=i-2){
                System.out.println();
                for(j=i;j<=a;j=j+2){
                    System.out.print(esp);
                }
                for(k=1;k<=a;k++){
                    if(k==1 || k== i){
                        System.out.print(ast);
                    }else{
                        System.out.print(esp);
                    }
                }
        
            }
            for(i=3;i<=a;i=i+2){
                System.out.println();
                for(j=a;j>=i;j=j-2){
                    System.out.print(esp);
                }
                for(k=1;k<=a;k++){
                    if(k==1 || k==i){
                        System.out.print(ast);
                    }else{
                        System.out.print(esp);
                    }
                }
        
            }
        seguir=false;
        }
    }
}
