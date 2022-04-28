class Docente
{
    String nombre;
    String apellido;
    String direccion;
    int ID;
    int telefono;
   
    void enseniar()
    {
        System.out.println("el docente ensenia programacion");
    }
     
    void planificarCurso()
    {
        System.out.println("el docente planifica los temas de estudio");
    }

    void motivarAlumno()
    {
        System.out.println("el docente motiva a Andres a hacer su tarea");
    }


    public static void main(String [] args){
        Docente docente1 = new Docente();
        
        docente1.nombre = "Braulio";
        docente1.apellido = "Rodriguez Mora";
        docente1.ID = 2626678;
        docente1.direccion = "jr: aAguilar 456";
        docente1.telefono = 962456376;

        System.out.println("El nombre del docente es: "+docente1.nombre);
        System.out.println("El apellido del docente es: "+docente1.apellido);
        System.out.println("El ID del docente es: "+docente1.ID);
        System.out.println("La direccion del docente es: "+docente1.direccion);
        System.out.println("El telefono del docente es: "+docente1.telefono);
        docente1.enseniar();
        docente1.planificarCurso();
        docente1.motivarAlumno();

    } 
}
