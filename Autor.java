 class Autor {
    
    String nombre;
    String apellido;
    String paisDeOrigen;
    int edad;
    String genero;

    void crearHistorias()
    {
        System.out.println("carlos crea la historia perfecta de dos hicos enamorados");
    }
    void investigar()
    {
        System.out.println("carlos investiga sobre el romanticismo para plasmar en su historia");
    }

    public static void main(String [] args){
        Autor autor1 = new Autor();
        
        autor1.nombre = "Carlos";
        autor1.apellido = "Fernandez";
        autor1.paisDeOrigen = "Espania";
        autor1.edad = 73;
        autor1.genero = "Masculino";

        System.out.println("El nombre del Autor es: "+autor1.nombre);
        System.out.println("El apellido del Autor es: "+autor1.apellido);
        System.out.println("El pais del autor es: "+autor1.paisDeOrigen);
        System.out.println("La edad del autor es: "+autor1.edad);
        System.out.println("Genero del autor es: "+autor1.genero);
        autor1.crearHistorias();
        autor1.investigar();
    } 
}
