public class Ejercicio10 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Introduce todos los números positivos que quieras y te diré la media de ellos: ");
        int cont;
        float n1, n2, n3;
        n1 = 0;
        n2 = 0;
        cont = 0;
        while (n1 >= 0){
        cont++;
        System.out.printf("Introduce el número %d: ",cont);
        n1 = Float.parseFloat(System.console().readLine());
        if(n1 >= 0)
        n2 = n1 + n2;
        }
        n3 = n2/(cont-1);
        System.out.printf("La media de esos números es: %.2f",n3);
    }
}
