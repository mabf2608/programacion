public class Ejercicio12 {
    public static void main(String[] args) 
    throws InterruptedException {
        int linea=0;
        System.out.print("\033[32m");
        for (int i = 1;i<=8000;i++){
            char c=(char)((int)(Math.random()*95)+32);
            System.out.print(c);
            if (linea++ == 60) {
                linea = 0;
                Thread.sleep(50);
                System.out.println();
            
            }
        }   
    }
}