 class Caballo {
    
    String nombre;
    String tamanio;
    int peso;
    int edad;
    String color;

    void trasladar()
    {
        System.out.println("utilizan a Sandra para trasladar abono");
    }

    void comer()
    {
        System.out.println("sandra come manzanas por las tardes");
    }

    public static void main(String [] args){
        Caballo Caballo1 = new Caballo();
        
        Caballo1.nombre = "Sandra";
        Caballo1.tamanio = "mediano";
        Caballo1.peso = 300;
        Caballo1.color = "Blanco";
        Caballo1.edad = 2;

        System.out.println("El nombre del Caballo es: "+Caballo1.nombre);
        System.out.println("El tamanio del Caballo es: "+Caballo1.tamanio);
        System.out.println("La peso del Caballo es: "+Caballo1.peso);
        System.out.println("El color del Caballo es: "+Caballo1.color);
        System.out.println("La edad del Caballo es: "+Caballo1.edad);
        Caballo1.comer();
        Caballo1.trasladar();


    } 
}
