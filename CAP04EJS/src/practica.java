import java.util.Scanner;

public class practica {
    public static void main(String[] args) {

        //Primer usuario
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el nombre de la primera persona: ");
        String nom1 = sc.nextLine();
        System.out.print("Introduce los apellidos: ");
        String ape1 = sc.nextLine();
        System.out.print("Introduce la edad: ");
        String edad1 = sc.nextLine();
        Integer.parseInt(edad1);
        System.out.print("Introduce la altura en m: ");
        float alt1 = sc.nextFloat();
        System.out.print("Introduce la altura en kg: ");
        float peso1 = sc.nextFloat();
        float imc1 = (float)(peso1/Math.pow(alt1, 2));
        sc.nextLine();
        //Segundo usuario
        System.out.print("Introduce el nombre de la segunda persona: ");
        String nom2 = sc.nextLine();
        System.out.print("Introduce los apellidos: ");
        String ape2 = sc.nextLine();
        System.out.print("Introduce la edad: ");
        String edad2 = sc.nextLine();
        Integer.parseInt(edad2);
        System.out.print("Introduce la altura en m: ");
        float alt2 = sc.nextFloat();
        System.out.print("Introduce la altura en kg: ");
        float peso2 = sc.nextFloat();
        double imc2 = peso2/Math.pow(alt2, 2);
        System.out.println();
        System.out.println("**************************************************************************************************************");
        System.out.printf("%1s%15s%30s%15s%15s%15s%15s%4s%n","*","Nombre","Apellidos","Edad","Altura","Peso","IMC","*");
        System.out.println("**************************************************************************************************************");
        System.out.printf("%1s%15s%30s%15s%15.2f%15.2f%15.2f%4s%n","*",nom1,ape1,edad1,alt1,peso1,imc1,"*");
        System.out.printf("%1s%15s%30s%15s%15.2f%15.2f%15.2f%4s%n","*",nom2,ape2,edad2,alt2,peso2,imc2,"*");
        System.out.println("**************************************************************************************************************");
        System.out.println();
        if (imc1<imc2){
            System.out.printf("%s %s tiene un IMC menor que %s %s.", nom1,ape1,nom2,ape2);
        }else{
            if(imc1>imc2){
                System.out.printf("%s %s tiene un IMC mayor que %s %s.", nom1,ape1,nom2,ape2);
            }else{
                System.out.printf("%s %s tiene el mismo IMC que %s %s.", nom1,ape1,nom2,ape2);
            }
        }
        sc.close();
    }
}
//Importante el MathMax