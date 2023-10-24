public class Ejercicio24 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Introduce la altura de la piramide: ");
        int a = Integer.parseInt(System.console().readLine());
        int i, j, k;
        char e = ' ';
        for(i=0; i<= a; i++){
            j=1;
            System.out.println();
            while(j<=a-i){
                System.out.print(e);
                j++;
            }
            j=1;
            while(j<=2*i-1){
                for (k=1; k < i; k++){
                    System.out.print(k);
                j++;
                }
                for (k=i; k > 0; k--){
                    System.out.print(k);
                j++;
                }
            }
        }
        System.out.println();
    }
}
