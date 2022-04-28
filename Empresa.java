 class Empresa {
    
    String nombre;
    String ubicacion;
    String gerente;
    String tipoDeEmpresa;
    int telefono;

    void brindaServicios()
    {
        System.out.println("CHINCHAYSUYO brinda servicios de transporte");
    }

    public static void main(String [] args){
        Empresa empresa1 = new Empresa();
        
        empresa1.nombre = "CHINCHAYSUYO";
        empresa1.ubicacion = "Jirón Seichi Izumi 620, Huánuco";
        empresa1.gerente= " Alfredo Torres";
        empresa1.tipoDeEmpresa = "SAC";
        empresa1.telefono =  516760;

        System.out.println("El nombre de la empresa es: "+empresa1.nombre);
        System.out.println("El ubicacion de la empresa es: "+empresa1.ubicacion);
        System.out.println("El gerente de la empresa es: "+empresa1.gerente);
        System.out.println("El tipo de la empresa es: "+empresa1.tipoDeEmpresa);
        System.out.println("El telefono de la empresa es: "+empresa1.telefono);
        empresa1.brindaServicios();
    } 
}
