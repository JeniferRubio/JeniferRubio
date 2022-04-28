 class Curso {
    
    String nombre;
    String docente;
    float duracion;
    int numeroDeAlumnos;
    float costeDeMatricula;

    void desarrollarTemas()
    {
        System.out.println("el curso de matematica desarrollo un tema de fracciones");
    }

    void recuperarConocimientos()
    {
        System.out.println("El curso de matematica Basica me hizo recordar de los exponentes");
    }

    public static void main(String [] args){
        Curso curso1 = new Curso();
        
        curso1.nombre = "Matematica Basica";
        curso1.docente= "Rodrigo Fernandez";
        curso1.duracion = 2.30f;
        curso1.numeroDeAlumnos = 30;
        curso1.costeDeMatricula = 120.82f;

        System.out.println("Nombre del  Curso es: "+curso1.nombre);
        System.out.println("Docente del  Curso es: "+curso1.docente);
        System.out.println("Duracion del  Curso es: "+curso1.duracion);
        System.out.println("Numero de alumnos del Curso es: "+curso1.numeroDeAlumnos);
        System.out.println("Coste de la matricula del Curso es: "+curso1.costeDeMatricula);
        curso1.recuperarConocimientos();
        curso1.desarrollarTemas();
    } 
}

