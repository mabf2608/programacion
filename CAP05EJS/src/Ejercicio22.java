public class Ejercicio22 {
    public static void primo(int v1, int v2){
    boolean esprimo=true;
    for(int n = v1; n<=v2; n++){
        esprimo=true;
        for (int i = 2; i < n; i++){
            if(n%i == 0){
            esprimo=false;
            }
        }
        if (esprimo){
            System.out.print(n+" ");
        }  
    }
    
}
    public static void main(String[] args) {
        int a = 2;
        int b = 100;
        primo(a, b);
    }
}