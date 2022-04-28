class Usuario
{
    String nombre;
    String gmail;
    int contrasenia;
    int ID;

    void iniciarSesion()
    {
        System.out.println("Mateo inicia sesion en la pagina de la universidad");
    }
    void cierraSesion()
    {
        System.out.println("Mateo cierra sesion de una pagina de ventas en Huánuco");
    }
    void realizaPagos()
    {
        System.out.println("Mateo paga un artefacto comprado en Plaza VEA");
    }

    public static void main(String [] args){
        Usuario usuario1 = new Usuario();
        
        usuario1.nombre = "Bryan Mateo ";
        usuario1.gmail = "Romero123@gmail.com";
        usuario1.contrasenia = 2012;
        usuario1.ID = 12345678;

        System.out.println("El nombre del usuario es: "+usuario1.nombre);
        System.out.println("el gmail del usuario es: "+usuario1.gmail);
        System.out.println("contresenia del usuario es: "+usuario1.contrasenia);
        System.out.println("El ID del usuario es: "+usuario1.ID);
        usuario1.iniciarSesion();
        usuario1.cierraSesion();
        usuario1.realizaPagos();
    } 
}