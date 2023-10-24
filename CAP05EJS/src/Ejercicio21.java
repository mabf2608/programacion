public class Ejercicio21 {
    public static void main(String[] args) {
        System.out.println("Introduce números positivos y te daré diferentes resultados: ");
        int cont, conti, may, i, n1, n2;
        n1=0;
        n2=0;
        may=0;
        cont = 1;
        conti= 0;
        i = 0;
        float medi=0;
        while(i == 0){
            System.out.println();
            System.out.printf("Introduce el número %d: %n",cont);
            n1= Integer.parseInt(System.console().readLine());
            if (n1>=0){
            if(n1%2!=0){
            n2=n1+n2;
            conti++;
            }
            if(n1%2==0 && n1>may){
            may=n1;
            }
            medi= (float)(n2/conti);
            cont++;
            }else{
            System.out.println();
            System.out.println("Saliendo del bucle...");
            System.out.println();
            i=1;
            cont=cont-1;
            }
        }
        System.out.printf("Se han introducido %d números positivos. %n",cont);
        System.out.printf("La media de los números impares es %.2f.%n",medi);
        System.out.printf("El número par más grande introducido es %d. %n",may);
    }
}
