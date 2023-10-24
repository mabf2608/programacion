public class Ejercicio25 {
    public static void reves(int v1){
        boolean entrada = true;
        while(entrada){
            int c = v1%10;
            v1 = v1/10;
            int d = v1;
            System.out.print(c);
            if (d==0)
            entrada=false;
        }
    }
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Introduce un número y te lo devuelvo del revés: ");
        int n = Integer.parseInt(System.console().readLine());
        System.out.println();
        System.out.print("Tu número dado del revés es: ");
        reves(n);
    }
}
