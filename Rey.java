class Rey 
{
    String nombre;
    String pais;
    int edad;
    String padres;

    void velarPorSuReino()
    {
        System.out.println("El rey Carlos ve las necesidades de su reino");
    }
 
    void mejorarElBienComun()
    {
        System.out.println("El rey Carlos manda a mejorar las calles y veredas de sus reino");
    }

    public static void main(String [] args){
        Rey rey1 = new Rey();
        
        rey1.nombre = "Carlos";
        rey1.pais = "España";
        rey1.edad = 73;
        rey1.padres = "carlos y Maria";

        System.out.println("El nombre del Rey es: "+rey1.nombre);
        System.out.println("El pais del Rey es: "+rey1.pais);
        System.out.println("La edad del Rey es: "+rey1.edad);
        System.out.println("Los padres del Rey son: "+rey1.padres);
        rey1.velarPorSuReino();
        rey1.mejorarElBienComun();

    } 
}