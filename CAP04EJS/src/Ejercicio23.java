public class Ejercicio23 {
    public static void main(String[] args) {
        try{
        System.out.println();
        System.out.println("Introduce la base imponible: ");
        float b = Float.parseFloat(System.console().readLine());
        System.out.println("Introduce el tipo de IVA (general, reducido o superreducido): ");
        String iva = System.console().readLine();
        System.out.println("Introduce el código promocional (nopro, mitad, meno5 o 5porc): ");
        String cod = System.console().readLine();
        float ivaf;
        String i;
        int salir = 0;
        switch(iva.toUpperCase()){
            case "GENERAL":
            ivaf = (float)0.21;
            i="(21%)";
            break;
            case "REDUCIDO":
            ivaf = (float)0.1;
            i="(10%)";
            break;
            case "SUPERREDUCIDO":
            ivaf = (float)0.04;
            i="(4%)";
            break;
            default:
            System.out.println();
            System.out.println("IVA introducido no válido, saliendo del programa...");
            ivaf = 0;
            salir = 1;
            i = "";
            break;
        }
        float codf;
        String c;
        float iva1=ivaf*b+b;
        switch(cod.toUpperCase()){
            case "NOPRO":
            codf = (float)(-0);
            c = "(nopro)";
            break;
            case "MITAD":
            codf = (float)(iva1/2);
            c = "(mitad)";
            break;
            case "MENO5":
            codf = (float)iva1-5;
            c = "(meno5)";
            break;
            case "5PORC":
            codf = (float)(iva1-iva1*0.05);
            c = "(5porc)";
            break;
            default:
            c = "";
            codf = 0;
            if (salir == 1){
            }else{
            System.out.println();
            System.out.println("Codigo introducido no válido, saliendo del programa...");
            salir = 1;}
            break;
        }
        if (salir == 1 ){
        }else{
        System.out.println();
        System.out.printf("%-1s%25.2f €%n","Base imponible",b);
        System.out.printf("%-1s%30.2f €%n","IVA "+i,(b*ivaf));
        System.out.printf("%-1s%25.2f €%n","Precio con IVA",(b+(b*ivaf)));
        System.out.printf("%-1s%20.2f €%n","Cód. promo. "+c,-1*codf);
        System.out.printf("%-1s%32.2f €%n","TOTAL: ",(b+(b*ivaf))-1*codf);
        }}
        catch(Exception e){
        System.out.println();
        System.out.println("Algo ha salido mal.");
        }
    }
}