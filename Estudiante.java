class Estudiante
{
    String nombre;
    String apellido;
    String direccion;
    int codigo;
    int edad;

    void aprender()
    {
        System.out.println("Marco aprende a sumar");
    }
    
    void hacerTarea()
    {
        System.out.println("Marco hace tarea de Biologia");
    }
    public static void main(String [] args){
        Estudiante estudiante1 = new Estudiante();
        
        estudiante1.nombre = " Marco";
        estudiante1.apellido = "chavez Mendoza";
        estudiante1.codigo = 56787357;
        estudiante1.direccion = "jr: Orquideas 456";
        estudiante1.edad = 15;

        System.out.println("El nombre del estudiante es: "+estudiante1.nombre);
        System.out.println("El apellido del estudiante es: "+estudiante1.apellido);
        System.out.println("El codigo del estudiante es: "+estudiante1.codigo);
        System.out.println("La direccion del estudiante es: "+estudiante1.direccion);
        System.out.println("La edad del estudiante es: "+estudiante1.edad);
        estudiante1.aprender();
        estudiante1.hacerTarea();

    } 
}
