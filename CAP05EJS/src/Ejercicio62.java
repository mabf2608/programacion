/*
*Ejercicio 62 | Tema 5
*Numero de la suerte
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio62 {
    public static void main(String[] args) {
        System.out.println();
        System.out.print("Introduce un número: ");
        long n = Long.parseLong(System.console().readLine());
        int i=0,j=0,l=0,nb=0,nm=0;
        String dato=""+n;
        l=dato.length();
        for (i=1;i<=l;i++){
            j=(int)n%10;
            n=n/10;
            if(j==3||j==7||j==8||j==9){
                nb++;
            }
            if(j==0||j==1||j==2||j==4||j==5||j==6){
                nm++;
            }
        }
        System.out.println();
        if(nb>nm)
            System.out.printf("El número %s es un número afortunado.",dato);
        if(nb<=nm)
            System.out.printf("El número %s no es un número afortunado.",dato);
    }
}
