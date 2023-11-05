public class Ejercicio34 {
    public static String digitos(long v1){
        boolean seguir = true;
        double p = v1;
        int i=0;
        String dato="";
        while (seguir){
            i=(int)(p%10);
            p=p/10;
            dato=dato+i;
            if (p<1){
                seguir=false;
            }
        }
        return dato;
    }
    public static void nums(long v1, long v2, String d1, String d2){
        int i=0,j=0;
        int l1=digitos(v1).length();
        int l2=digitos(v2).length();
        long n1=Long.parseLong(digitos(v1));
        long n2=Long.parseLong(digitos(v2));
        boolean seguir = true;
        System.out.println();
        System.out.printf("Dígitos %s: ",d1);
        while(seguir){
            long digito1 = n1 % 10;
            n1 = n1/10;
            long digito2 = n2 % 10;
            n2 = n2/10;
            if (digito1 % 2 ==0 && l1!=i){
                System.out.print(digito1);
            }
            i++;
            if (digito2 % 2 ==0 && l2!=j){
                System.out.print(digito2);
            }
            j++;
            if (l1 == i && l2==j){
                seguir=false;
            }
        }
        System.out.println();
        i=0;
        j=0;
        l1=digitos(v1).length();
        l2=digitos(v2).length();
        n1=Long.parseLong(digitos(v1));
        n2=Long.parseLong(digitos(v2));
        seguir = true;
        System.out.printf("Dígitos %s: ",d2);
        while(seguir){
            long digito1 = n1 % 10;
            n1 = n1/10;
            long digito2 = n2 % 10;
            n2 = n2/10;
            if (digito1 % 2 !=0 && l1!=i){
                System.out.print(digito1);
            }
            i++;
            if (digito2 % 2 !=0 && l2!=j){
                System.out.print(digito2);
            }
            j++;
            if (l1 == i && l2==j){
                seguir=false;
            }
        }
        
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.print("Por favor, introduzca un número: ");
        long n1 = Long.parseLong(System.console().readLine());
        System.out.print("Por favor, introduzca otro número: ");
        long n2 = Long.parseLong(System.console().readLine());
        String p= "pares";
        String i= "impares";
        nums(n1, n2, p, i);
    }
}
