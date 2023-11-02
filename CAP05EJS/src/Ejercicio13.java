public class Ejercicio13 {
    public static void main(String[] args) {
    try{
        System.out.println();
        System.out.println("Introduce 10 números y te diré que cantidad de esos números es positivo y cual es negativo: ");
        int po=0, ne=0;
        for(int i = 1;i<=10;i++){
            System.out.println("Número "+i+": ");
            int n = Integer.parseInt(System.console().readLine());
            ne += (n<0)?1:0; /*Si es verdadero suma el primer valor si no el segundo */
            po += (n>=0)?1:0;
        }
        System.out.println();
        System.out.printf("Hay una cantidad de %d/10 números positivos y %d/10 números negativos.",po,ne);
    }catch (Exception e){
        System.out.println("Ha habido un error inesperado, sigue las instrucciones y vuelve a intentarlo.");
    }
    }
}
