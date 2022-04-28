 class EntidadBancaria {
    
    String nombre;
    String gmail;
    String ubicacion;
    String asesores;

    void hacerPagos()
    {
        System.out.println("Roger paga el prestamo que le dio el banco la vez pasada");
    }
    void depositar()
    {
        System.out.println("Roger deposita 1000 soles a Maria");
    }
    public static void main(String [] args){
       EntidadBancaria entidad1 = new EntidadBancaria();
        
        entidad1.nombre = "BANCO DE TODOS";
        entidad1.gmail = "BANCODETODOS2020@gmail.com";
        entidad1.ubicacion = "jr: 28 de julio 308";
        entidad1.asesores = "Jesus Marengo y Luis Palermo";

        System.out.println("El nombre de la entidad bancaria es: "+entidad1.nombre);
        System.out.println("El gmail de la entidad bancaria es: "+entidad1.gmail);
        System.out.println("Ubicacion de la entidad bancaria es: "+entidad1.ubicacion);
        System.out.println("Asesores de la entidad bancaria es: "+entidad1.asesores);
        entidad1.hacerPagos();
        entidad1.depositar();
    } 
}
