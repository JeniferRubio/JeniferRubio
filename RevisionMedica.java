 class RevisionMedica {
    
    String paciente;
    String hora;
    String fecha;
    int codigo;

    void asignarDoctor()
    {
        System.out.println("segun la enfermedad de la paciente le asignaron un doctor especialista en pulmones");
    }
    

    public static void main(String [] args){
        RevisionMedica revision1 = new RevisionMedica();
        
        revision1.paciente =  "Mateo Andres ";
        revision1.hora = "3:00pm";
        revision1.fecha= "06/06/2022";
        revision1.codigo= 12345678;

        System.out.println("Paciente: "+revision1.paciente);
        System.out.println("hora: "+revision1.hora);
        System.out.println("fecha: "+revision1.fecha);
        System.out.println("codigo: "+revision1.codigo);
        revision1.asignarDoctor();

    } 
}
