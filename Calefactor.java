public class Calefactor {
    
   //atributos
    
   String color; 
   String marca; 
   String modelo;
   int temperatura;
    //operaciones


   void fijarTemperatura()
   {
       System.out.println("El calefactor fija la temperatura para estar calentitos");
   }

   public static void main(String[] args)
   {
      Calefactor calefactor1 = new Calefactor();
       
      calefactor1.color = "Negro";
      calefactor1.marca = "Rowenta";
      calefactor1.modelo = "SO6510F2";
      calefactor1.temperatura =  250;

      System.out.println("La temperatura del calefactor es: "+calefactor1.temperatura);
      System.out.println("El color del calefactor es: "+calefactor1.color);
      System.out.println("La marca de la moto es: "+calefactor1.marca);
      System.out.println("el modelo de la moto es: "+calefactor1.modelo);
      calefactor1.fijarTemperatura();
   }

}
