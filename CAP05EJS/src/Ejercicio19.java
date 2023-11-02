public class Ejercicio19 {
    public static void piramide(int v1, String v2, String v3){
        for(int i = 0; i <= v1 ; i ++){
            int salida = 1;
            while (salida <= v1-i){
                System.out.print(v3);
                salida++;
            }
            salida = 1;
            while (salida <= 2*i-1){
                System.out.print(v2);
                salida ++;
            }
            System.out.println();
        } 
    }
    public static void main(String[] args) {
        System.out.println();
        System.out.print("Introduce la altura de la pirámide: ");
        int alt = Integer.parseInt(System.console().readLine());
        boolean parar = true;
        String c="";
        while(parar){
            System.out.print("Introduce el carácter con el que quieras realizar la pirámide: ");
            c = System.console().readLine();
            int l = c.length();
            if(l > 1 || l < 0){
                System.out.println();
                System.out.println("ERROR: Recuerda introducir solo 1 carácter.");
            }else{
                parar=false;
            }
        }
        String e = " ";
        piramide(alt, c, e);
    }
} 