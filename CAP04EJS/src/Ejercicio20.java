public class Ejercicio20 {
    public static void main(String[] args) {
        try {
            System.out.println();
            System.out.println("Introduce un número entero positivo para saber si es capicúa: ");
            int n = Integer.parseInt(System.console().readLine());
            int n1,n2,n3,n4,n5,cap;

            if (n<0 || n >99999){
                System.out.println("Error, debes introducir un numero entero positivo de 5 cifras como máximo.");
            }else{
                System.out.println();
                    if (n>=0 && n<10){
                    System.out.printf("%d es un numero capicúa.",n);
                }else{
                    if (n>=10 && n<100){
                    n1 = n%10;
                    n2 = n/10;
                    cap = Integer.parseInt(""+n1+n2);
                        if (n == cap){
                            System.out.printf("%d es un numero capicúa.",n);
                        }else{
                            System.out.printf("%d no es un numero capicúa.",n);
                        }
                }else{
                    if (n>=100 && n<1000){
                    n1 = n%10;
                    n2 = (n/10)%10; 
                    n3 = n/100;
                    cap = Integer.parseInt(""+n1+n2+n3);
                        if (n == cap){
                            System.out.printf("%d es un numero capicúa.",n);
                        }else{
                            System.out.printf("%d no es un numero capicúa.",n);
                         }
                }else{
                    if (n>=1000 && n<10000){
                    n1 = n%10;
                    n2 = (n/10)%10; 
                    n3 = (n/100)%10;
                    n4 = n/1000;
                    cap = Integer.parseInt(""+n1+n2+n3+n4);
                        if (n == cap){
                            System.out.printf("%d es un numero capicúa.",n);
                        }else{
                            System.out.printf("%d no es un numero capicúa.",n);
                        }
                }else{
                    if (n>=10000 && n<100000){
                    n1 = n%10;
                    n2 = (n/10)%10; 
                    n3 = (n/100)%10;
                    n4 = (n/1000)%10;
                    n5 = n/10000;
                    cap = Integer.parseInt(""+n1+n2+n3+n4+n5);
                        if (n == cap){
                            System.out.printf("%d es un numero capicúa.",n);
                        }else{
                            System.out.printf("%d no es un numero capicúa.",n);
                        }
                }
                }
                }
                }
                }
            }
        }
        catch (Exception e) {
            System.out.println();
            System.out.println("ERROR: Algo ha salido mal durante la ejecución, vuelva a intentarlo.");
        }finally{
            System.out.println();
            System.out.println();
            System.out.println("Fin de la ejecución. ¡Pase un buen día!");
        }
    }
}