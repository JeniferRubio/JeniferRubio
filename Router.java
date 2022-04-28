 class Router {
    
    String operador;
    float bandaDeFrecuencia;
    String numeroDeSerio;   
    String modelo;

    void ofreceConexionWifi()
    {
        System.out.println("por fin conectaron el router ahora si podre navegar sin interrupciones");
    }
    
    public static void main(String [] args){
        Router router1 = new Router();
        
        router1.operador = "claro";
        router1.bandaDeFrecuencia = 2.4f;
        router1.numeroDeSerio = "2A185048565757";
        router1.modelo = "WRT54GX4";

        System.out.println("El operador del Router es: "+router1.operador);
        System.out.println("Banda de Frecuencia del Router es: "+router1.bandaDeFrecuencia);
        System.out.println("El numero de Serie es: "+router1.numeroDeSerio);
        System.out.println("El modelo del Router es: "+router1.modelo);
        router1.ofreceConexionWifi();


    } 
}
