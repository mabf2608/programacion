public class Ejemplo1{
    public static void main(String[] args) {
        System.out.println("Bucle For.");
        System.out.println("***************");
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
        System.out.println("Bucle While.");
        System.out.println("***************");
        int i  = 1;
        while(i<=10){
            System.out.println(i);
            i++;
        }

        System.out.println("Bucle Do While.");
        System.out.println("***************");
        i  = 1;
        do{
            System.out.println(i);
            i++;
        }while(i<=10);
    }
}