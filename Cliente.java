 class Cliente {
    
    String nombre;
    String direccion;
    int ruc;
    int telefono;

    void comprarProductos()
    {
        System.out.println("rogelio compra zapatos en Bata");
    }
    void verProductos()
    {
        System.out.println("Rogelio ve las addidas forum que venden en Fundamentals y le gusto");
    }

    public static void main(String [] args){
        Cliente cliente1 = new Cliente();
        
        cliente1.nombre = "Rogelio ";
        cliente1.direccion = "Romero";
        cliente1.ruc = 102890839;
        cliente1.telefono = 987678234;

        System.out.println("El nombre del cliente es: "+cliente1.nombre);
        System.out.println("el direccion del cliente es: "+cliente1.direccion);
        System.out.println("ruc del cliente es: "+cliente1.ruc);
        System.out.println("El telefono del cliente es: "+cliente1.telefono);
        cliente1.verProductos();
        cliente1.comprarProductos();

    } 
}
