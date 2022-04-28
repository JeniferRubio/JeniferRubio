class Proveedor
{
    String nombre;
    String direccion;
    int RUC;
    int telefono;

    void distribuirProductos()
    {
        System.out.println("lupita distribuye 20 six pack de gaseosa Guaraná");
    }
    
    void comprarProductos()
    {
        System.out.println("lupita compra por mayor gaseosa Inka Kola");
    }


    public static void main(String [] args){
        Proveedor proveedor1 = new Proveedor();
        
        proveedor1.nombre = "lupita ";
        proveedor1.direccion = "jr.: Los Girasoles 203";
        proveedor1.RUC = 201256357;
        proveedor1.telefono = 962345765;

        System.out.println("El nombre del proveedor es: "+proveedor1.nombre);
        System.out.println("la direccion del proveedor es: "+proveedor1.direccion);
        System.out.println("RUC del proveedor: "+proveedor1.RUC);
        System.out.println("El telefono del proveedor es: "+proveedor1.telefono);
        proveedor1.distribuirProductos();
        proveedor1.comprarProductos();

    } 
}

