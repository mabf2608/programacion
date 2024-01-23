package apuntes;

public class Coche{
    //Un modificador de acceso nos permite evitar o permitir que los datos se puedan modificar desde fuera de la clase. Encapsulación
    private int ruedas, largo, ancho,  peso_plataforma;
    private String color;
    private int peso_total;
    private boolean asientos_cuero, climatizador;
    //Método constructor, se encarga de dar un estado inicial a nuestro objeto
    //Mismo nombre que la clase
    public Coche(){
        ruedas=4;
        largo=2000;
        ancho=300;
        peso_plataforma=500;
    }
    //Los métodos nos van a permitir que las clases interactúen entre si
    //SETTER
    public void establece_color(String color_coche){

        color=color_coche;
    }
    public void establece_asientos(String asientos_cuero){

        if(asientos_cuero.equals("si")){
            this.asientos_cuero=true;
        }else{
            this.asientos_cuero=false;
        }
    }
    public void configura_climatizador(String climatizador){
        if(climatizador.equals("si")){
            this.climatizador=true;
        }else{
            this.climatizador=false;
        }
    }
    //GETTER
    public String dime_datos_generales(){

        return "La plataforma del vehículo tiene "+ruedas+" ruedas"+". Mide "+largo/1000+" metros con un ancho de "+ancho+" cm y un peso de "+peso_plataforma+" kg." ;
    }
    public String dime_color(){

        return "El color del coche es "+color+".";
    }
    public String dime_asientos(){

        if(asientos_cuero==true){
            return "El coche tiene asientos de cuero";
        }else{
            return "El coche no tiene asientos de cuero";
        }
    }
    public String dime_climatizador(){

        if(climatizador==true){
            return "El coche incorpora climatizador.";
        }else{
            return "El coche lleva aire acondicionado.";
        }
    }
    //GETTER SETTER (no recomendado)
    public String dime_peso_coche(){

        int peso_carrocería=500;
        peso_total=peso_plataforma+peso_carrocería;

        if (asientos_cuero==true){
            peso_total=peso_total+50;
        }

        if (climatizador==true){
            peso_total=peso_total+20;
        }

        return "El peso total del coche es de "+peso_total+" kg.";

    }

    public int precio_coche(){

        int precio_final=10000;

        if (asientos_cuero==true){
            precio_final+=2000;
        }

        if (climatizador==true){
            precio_final+=1500;
        }
        return precio_final;
    }
    
}