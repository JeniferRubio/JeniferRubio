 class Computadora 
 {
    String marca;
    String mesDeCompra;
    String numeroDeSerio;  
    String referencia;
    float velocidadDeProcesador;

    void informar()
    {
        System.out.println("la computadora informa mediante una busqueda intensa sobre los fenomenos del pais");
    }
    void procesarDatos()
    {
        System.out.println("la computadora procesa datos cuando son ingresados por el usuario");
    }

    public static void main(String [] args){
        Computadora computadora1 = new Computadora();
        
        computadora1.marca = "Lenovo";
        computadora1.mesDeCompra = "Abril";
        computadora1.referencia= "Computador A62 Lenovo" ;
        computadora1.numeroDeSerio = "4A185048W";
        computadora1.velocidadDeProcesador = 3.20f;

        System.out.println("La marca de la computadora es: "+computadora1.marca);
        System.out.println("Mes de la compra de la computadora es: "+computadora1.mesDeCompra);
        System.out.println("Referencia de la computadora es: "+computadora1.referencia);
        System.out.println("El numero de Serie es: "+computadora1.numeroDeSerio);
        System.out.println("La velocidad de su procesador es: "+computadora1.velocidadDeProcesador);
        computadora1.informar();
        computadora1.procesarDatos();

    } 
}

