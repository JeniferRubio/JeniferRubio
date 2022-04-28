class Libro 
{
    
    String titulo;
    String autor;
    String editorial;
    int paginas;
    int capitulos;

    void informar()
    {
        System.out.println("El libro noche azul informa sobre el amor de dos personas con familias en pugna");
    }

    void persuadir()
    {
        System.out.println("el libro persuade a seguir leyendo con las magnificas historias de guerra");
    }
    public static void main(String [] args){
        Libro libro1 = new Libro();
        
        libro1.titulo = "La noche azul";
        libro1.autor = "Luis Fernandez";
        libro1.editorial = "santillana";
        libro1.paginas = 173;
        libro1.capitulos = 3;

        System.out.println("El titulo del Libro es: "+libro1.titulo);
        System.out.println("El autor del Libro es: "+libro1.autor);
        System.out.println("El editorial  del Libro es: "+libro1.editorial);
        System.out.println("paginas del Libro es: "+libro1.paginas);
        System.out.println("capitulos del Libro es: "+libro1.capitulos);
        libro1.persuadir();
        libro1.informar();
    } 
}

