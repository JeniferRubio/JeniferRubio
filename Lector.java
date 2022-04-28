 class Lector {
    
    String nombre;
    String apellido;
    String direccion;
    int telefono;


    void comprarLibros()
    {
        System.out.println("Moises va a comprar la segunda edicion de atrapados");
    }

  

    public static void main(String [] args){
        Lector Lector1 = new Lector();
        
        Lector1.nombre = "Moises";
        Lector1.apellido = "Mendoza";
        Lector1.direccion = "jr: Tupac Amaru II - 456";
        Lector1.telefono = 989967815;

        System.out.println("El nombre del Lector es: "+Lector1.nombre);
        System.out.println("El apellido del Lector es: "+Lector1.apellido);
        System.out.println("La direccion del Lector es: "+Lector1.direccion);
        System.out.println("El telefono del Lector es: "+Lector1.telefono);
        Lector1.comprarLibros();
       


    } 
}

