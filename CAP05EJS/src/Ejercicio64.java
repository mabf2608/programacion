/*
*Ejercicio 64 | Tema 5
*Rectangulo hueco
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio64 {
    public static void main(String[] args) {
        System.out.println();
        boolean seguir=true;
        int alt=3, anch=6;
        while (seguir) {
            for(int i=1;i<=alt;i++){
            if (i==1||i==alt){
                for(int j=1;j<=anch;j++){
                    System.out.print("*");
                }
            }else{
                for(int j=1;j<=anch;j++){
                    if (j==1||j==anch){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
            }
        System.out.println();
        System.out.println("Introduce una de las siguientes opciones: ");
        System.out.println("1.- Agrandarlo.");
        System.out.println("2.- Achicarlo.");
        System.out.println("3.- Cambiar la orientación.");
        System.out.println("4.- Salir");
        int opcion=Integer.parseInt(System.console().readLine());
        switch (opcion) {
            case 1:
                alt++;
                anch++;
                break;
            case 2:
                alt--;
                anch--;
                break;
            case 3:
                int aux=alt;
                alt=anch;
                anch=aux;
                break;
            case 4:
                System.out.println("Saliendo del programa...");
                seguir=false;
                break;
            default:
            System.out.println("ERROR: Opción no válida.");
                break;
        }
        System.out.println();
        }
    }
}
