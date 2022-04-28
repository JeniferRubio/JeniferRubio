class Paciente 
{
    String nombre;
    String apellido;
    int DNI;
    int codigo;

    public static void main(String [] args){
        Paciente paciente1 = new Paciente();
        
        paciente1.nombre = "Bryan Fisher ";
        paciente1.apellido = "Rojas Chavez";
        paciente1.DNI = 73638346;
        paciente1.codigo = 1234;

        System.out.println("El nombre del paciente es: "+paciente1.nombre);
        System.out.println("el apellido del paciente es: "+paciente1.apellido);
        System.out.println("DNI del paciente: "+paciente1.DNI);
        System.out.println("El codigo del paciente es: "+paciente1.codigo);

    } 
}