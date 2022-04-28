 class Moto
    
    {
        //atributos
    
        String propietario;
        String color; 
        String marca; 
        String modelo;
         //operaciones


        void movilizar()
        {
            System.out.println("moviliza a Juan a su trabajo");
        }
        public static void main(String[] args)
        {
           Moto moto1 = new Moto();
            
           moto1.propietario = "Jarlu Romero";
           moto1.color = "Negro";
           moto1.marca = "Honda";
           moto1.modelo = "Wave 110S";
    
           System.out.println("el propietario de la moto es: "+moto1.propietario);
           System.out.println("el color de la moto es: "+moto1.color);
           System.out.println("la marca de la moto es: "+moto1.marca);
           System.out.println("el modelo de la moto es: "+moto1.modelo);
           moto1.movilizar();
        }
    
    }
    