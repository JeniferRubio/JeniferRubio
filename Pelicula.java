 class Pelicula {
    
    String nombre;
    String genero;
    String actorPrincipal;
    String directorDeRodaje;

    void entretener()
    {
        System.out.println("los tres bandidos estuve bien entretenido en esta tarde de osio");
    }

    public static void main(String [] args){
        Pelicula pelicula1 = new Pelicula();
        
        pelicula1.nombre = "los tres bandalos";
        pelicula1.actorPrincipal = "Tomás Fernandez";
        pelicula1.directorDeRodaje = "Eduardo Lopez";
        pelicula1.genero = "accion";

        System.out.println("El nombre de la pelicula es: "+pelicula1.nombre);
        System.out.println("El actor principal de la pelicula es: "+pelicula1.actorPrincipal);
        System.out.println("Director de la pelicula es: "+ pelicula1.directorDeRodaje);
        System.out.println("Genero de la pelicula es: "+ pelicula1.genero);
        pelicula1.entretener();

    } 
}
