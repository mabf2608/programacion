public class Ejercicio21 {
    public static void main(String[] args) {
        try {
        System.out.println();
        System.out.println("Introduce la nota de tu primer examen de programación: ");
        float n1 = Float.parseFloat(System.console().readLine());
        System.out.println("Introduce la nota de tu segundo examen de programación: ");
        float n2 = Float.parseFloat(System.console().readLine());
        float media = (n1+n2)/2;
        if (media >= 5){
            System.out.println();
            System.out.printf("Nota del primer control: %.2f%n",n1);
            System.out.printf("Nota del segundo control: %.2f%n",n2);
            System.out.printf("Nota del módulo: %.2f%n",media);
        }else{
            System.out.println();
            System.out.printf("Nota del primer control: %.2f%n",n1);
            System.out.printf("Nota del segundo control: %.2f%n",n2);
            System.out.printf("Nota del módulo: %.2f%n",media);
            System.out.print("Introduce el resultado de la recuperación (apto/no apto): ");
            String x = System.console().readLine();
            String rec = x.toUpperCase();
            if (rec.equals("APTO")){
            System.out.printf("Tu nota de programación es: 5%n");
            }else{
            System.out.printf("Tu nota de programación es: %.2f%n",media);
            }
        }
        }catch (NumberFormatException e){
            System.out.println("No has introducido una nota válida.");
        }catch (Exception e) {
            System.out.println("Ha habido un error inesperado, vuelve a intentarlo.");
        }
        
    }
}
