 class Automovil
 {
    //atributos

    String propietario;
    String color; 
    String marca; 
    int km;
     //operaciones
    void transportarPersonas()
    {
        System.out.println("transpota a Maria a su trabajo");
    }
    public static void main(String[] args)
    {
       Automovil automovil1 = new Automovil();
        
       automovil1.propietario = "Keyshi Rubio";
       automovil1.color = "Negro";
       automovil1.marca = "Audi";
       automovil1.km = 0;

       System.out.println("el propietario del automivil1 es: "+automovil1.propietario);
       System.out.println("el color del automivil1 es: "+automovil1.color);
       System.out.println("la marca del automivil1 es: "+automovil1.marca);
       System.out.println("Los km del automovil1 es: "+automovil1.km);
       automovil1.transportarPersonas();
    }

}
