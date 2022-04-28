 class Reservacion {
    
   
    String cliente;
    String fecha;
    String hora;
    float valorDePago;

    public static void main(String [] args){
        Reservacion Reservacion1 = new Reservacion();
        
        Reservacion1.cliente = "Rodrigo Fernandez";
        Reservacion1.fecha= "12/06/2020";
        Reservacion1.hora = "2:30pm";
        Reservacion1.valorDePago = 100.50f;

        System.out.println("cliente de la reservacion es: "+Reservacion1.cliente);
        System.out.println("fecha de la reservaciones: "+Reservacion1.fecha);
        System.out.println("hora de la reservacion: "+Reservacion1.hora);
        System.out.println("valor de pago de la reservacion es: "+Reservacion1.valorDePago);

    } 
}
