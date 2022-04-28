class Diagnostico {
    
    String enfermedad;
    String observaciones;
    String recetaMedica;
    
    void crearReceta()
    {
        System.out.println("el doctor crea una serie de recetas para parar las dolencias de la paciente");
    }

    public static void main(String [] args){
      Diagnostico diagnostico1 = new Diagnostico();
        
        diagnostico1.enfermedad = "diabetes";
        diagnostico1.observaciones = "ninguna";
        diagnostico1.recetaMedica = "insulina y dieta";

        System.out.println("Enferdad: "+diagnostico1.enfermedad);
        System.out.println("Observaciones: "+diagnostico1.observaciones);
        System.out.println("Receyta medica: "+diagnostico1.recetaMedica);
        diagnostico1.crearReceta();
       

    } 
}
