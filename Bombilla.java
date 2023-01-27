public class Bombilla {
    
    
    //----------------VARIABLES---------------
   boolean estado_interruptor_individual=false;
   boolean estado_general=false;

    //---------------CONSTRUCTOR/ES-----------

    public Bombilla(){};

    //----------------METODOS-----------------

    public boolean encender_apagar(boolean x){
        return estado_interruptor_individual=x;
   }
   
   public boolean estado_bombilla(){
      boolean resultado=false;
      if(estado_interruptor_individual==true&estado_general==true){
        resultado=true;
      }
       return resultado;
   }

   public void apagar_general(boolean x){
     if(x==false){
        estado_general=false;
        estado_interruptor_individual=false;
     }
    }
 
public void encender_general(boolean x){
       //----PRIMER IF----
    if(x==true){
        if(estado_interruptor_individual==true){
            estado_interruptor_individual=false;
        }
          else{
            estado_interruptor_individual=true;
         }
        }
       }
    
    }
      
     
   



