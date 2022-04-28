 class Hospital {
    
    String nombre;
    String ubicacion;
    String director;
    int telefono;
   
    void brindarAtencion()
    {
        System.out.println("El hospital Hermilio Valdizan brinda atencion a los enfermos");
    }
    void registrarPaciente()
    {
        System.out.println("la enfermera Lulu registra a su paciente numero 27");
    }

    public static void main(String [] args){
        Hospital hospital1 = new Hospital();
        
        hospital1.nombre = "Hermilio Valdizan";
        hospital1.ubicacion = "Jr: Hermilio Valdizan y constitucion";
        hospital1.director = "Edu Alfredo";
        hospital1.telefono = 987645773;

        System.out.println("El nombre del Hospital es: "+hospital1.nombre);
        System.out.println("El ubicacion del Hospital es: "+hospital1.ubicacion);
        System.out.println("El director del Hospital es: "+hospital1.director);
        System.out.println("el telefono del Hospital es: "+hospital1.telefono);
       hospital1.brindarAtencion();
       hospital1.registrarPaciente();

    } 
}