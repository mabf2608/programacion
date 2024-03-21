package ejercicios.ejercicio15;

public class usoFichaDomino {
    public static int random(){
        int n=(int)(Math.random()*6);
        return n;
    }
    public static void main(String[] args) {
        int lado1=random(), lado2=random();
        int aux;

        for(int i = 1;i <= 8 ; i++){
            
            aux=lado2;

            if(i!=1){
                do{
                    lado1=random();
                    lado2=random();
                }while(lado1!=aux);
            }

            FichaDomino f1 = new FichaDomino(lado1, lado2);
            System.out.print(f1+" ");
        } 
    } 
}
