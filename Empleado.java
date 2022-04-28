 class Empleado {
    
    String nombre;
    String cargo;
    float salario;
    int edad;

    public static void main(String [] args){
        Empleado empleado1 = new Empleado();
        
        empleado1.nombre = "Mateo Rogelio ";
        empleado1.cargo= "administrador";
        empleado1.salario = 1954.8f;
        empleado1.edad = 43;

        System.out.println("El nombre del empleado es: "+empleado1.nombre);
        System.out.println("El cargo del empleado es: "+empleado1.cargo);
        System.out.println("El salario del empleado es: "+empleado1.salario);
        System.out.println("La edad del empleado es: "+empleado1.edad);

    } 
}
