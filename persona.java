class Persona
{
    String nombre;
    String apellido;
    String genero;  
    String direccion;
    int DNI;
    int peso;
    float altura;
    int edad;

    void comer()
    {
        System.out.println("Bryan come pan en las manianas ");
    }

    void correr()
    {
        System.out.println("Bryan corre en el parque con su perro ");
    }
     
    void leer()
    {
        System.out.println("Bryan lee Peter Pan con sus sobrinitos");
    }


    public static void main(String [] args){
        Persona persona1 = new Persona();
        
        persona1.nombre = "Bryan";
        persona1.apellido = "Raraz";
        persona1.genero = "masculino" ;
        persona1.DNI = 62626678;
        persona1.peso = 70;
        persona1.altura = 1.70f;
        persona1.direccion = "jr: aAguilar 456";
        persona1.edad = 18;

        System.out.println("El nombre de la persona es: "+persona1.nombre);
        System.out.println("El apellido de la persona es: "+persona1.apellido);
        System.out.println("Genero de la persona es: "+persona1.genero);
        System.out.println("El DNI de la persona es: "+persona1.DNI);
        System.out.println("El peso de la persona es: "+persona1.peso);
        System.out.println("La direccion de la persona es: "+persona1.direccion);
        System.out.println("La edad de la persona es: "+persona1.altura);
        persona1.comer();
        persona1.correr();
        persona1.leer();


    } 
}
