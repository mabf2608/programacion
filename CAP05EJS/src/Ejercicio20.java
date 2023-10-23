public class Ejercicio20 {
    public static void piramide(int v1, String v2, String v3){
        for(int i = 0; i <= v1 ; i ++){
            int salida = 1;
            while (salida <= v1-i){
                System.out.print(v3);
                salida++;
            }
            if (i == 1 || i == v1){
                for (salida = 1; salida <= i*2-1 ; salida++){
                    System.out.print(v2);
                }
            }else{
            salida = 1;
            while (salida <= 2*i-1){
                if (salida == 1 || salida == 2*i-1){
                    System.out.print(v2);
                    salida++;
                }else{
                    System.out.print(v3);
                    salida++;
                }
            }
        }
            System.out.println();
            
        } 
    }
    public static void main(String[] args) {
        System.out.println();
        System.out.print("Introduce la altura de la pirámide: ");
        int alt = Integer.parseInt(System.console().readLine());
        System.out.print("Introduce el carácter con el que quieras realizar la pirámide: ");
        String c = System.console().readLine();
        String e = " ";
        int l = c.length();
        if(l < 1 && l < 0)
            System.out.println("ERROR: Recuerda introducir solo 1 carácter.");
        else
            piramide(alt, c, e);
    }
}
