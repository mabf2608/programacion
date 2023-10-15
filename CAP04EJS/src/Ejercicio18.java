public class Ejercicio18 {
    public static void main(String[] args) {
    System.out.println();
    System.out.println("Introduce un número entero positivo de hasta 5 cifras: ");
    System.out.println();
    int n = (Integer.parseInt(System.console().readLine()));
    if (n >= 0 && n  < 10){
        System.out.printf("La primera y única cifra de %d es %d.%n",n,n);
    }else{
        if (n >= 10 && n < 100){
            int cifra = n/10;
            System.out.printf("La primera cifra de %d es %d.%n",n,cifra);
        }else{
            if (n >= 100 && n < 1000){
                int cifra = n/100;
                System.out.printf("La primera cifra de %d es %d.%n",n,cifra);
            }else{
                if (n >= 1000 && n < 10000){
                    int cifra = n/1000;
                    System.out.printf("La primera cifra de %d es %d.%n",n,cifra);
                }else{
                    if (n >= 10000 && n < 100000){
                        int cifra = n/10000;
                        System.out.printf("La primera cifra de %d es %d.%n",n,cifra);
                    }else{
                        System.out.println("Solo se permiten número de hasta 5 cifras.");
                            
                        }
                    }
                }
            }
        }
    }
}
