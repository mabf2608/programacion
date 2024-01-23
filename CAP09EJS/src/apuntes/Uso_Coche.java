package apuntes;

public class Uso_Coche {
    public static void main(String[] args) {
        System.out.println();
        //Instanciar una clase, llama al constructor
        Coche micoche=new Coche(); 

        System.out.println("Introduce el color del coche: ");
        String color=System.console().readLine();
        micoche.establece_color(color);
        
        System.out.println("Introduce si tus asientos son de cuero (si o no):");
        String asientos=System.console().readLine();
        micoche.establece_asientos(asientos);

        System.out.println("Introduce si tienes climatizador (si o no):");
        String climatizador=System.console().readLine();
        micoche.configura_climatizador(climatizador);

        micoche.dime_peso_coche();

        System.out.println(micoche.dime_datos_generales());
        System.out.println(micoche.dime_color());
        System.out.println(micoche.dime_asientos());
        System.out.println(micoche.dime_climatizador());
        System.out.println(micoche.dime_peso_coche());
        System.out.println("El precio total del coche es "+micoche.precio_coche()+" €.");
    }
}
