 class Revista {
    
    String titulo;
    String autor;
    String edicion;
    String tipoDeRevista;
    
    void entrener()
    {
        System.out.println("la revista entretetiene a mi abuela con la nueva moda 2022");
    }
    void persuadir()
    {
        System.out.println("la revista de moda persuadio a mi mamá a comprar ese chaleco negro");
    }
    public static void main(String [] args){
        Revista revista1 = new Revista();
        
        revista1.titulo = "azul";
        revista1.autor = "Luis Medina";
        revista1.edicion = "ISSN 0317-8471";
        revista1.tipoDeRevista = "informativa";

        System.out.println("El titulo de la Revista es: "+revista1.titulo);
        System.out.println("El autor de la Revista es: "+revista1.autor);
        System.out.println("El edicion  de la Revista es: "+revista1.edicion);
        System.out.println("tipo de la Revista es: "+revista1.tipoDeRevista);
        revista1.persuadir();
        revista1.entrener();
       

    } 
}

