/**
  * Escoge piedra, papel o tijera al azar
  */

package ende;

public class Jugador {
	
	Integer c = (int)(Math.random()*3);
    String opcion="";
    
    int éxitos;      // número de partidas ganadas
    int winTotal;
    
    public Jugador() {
    	
    }
    
    public String opcion_al_azar()
    {
        switch(c){
            case 0:
            	opcion=("piedra");
                break;
            case 1:
            	opcion=("papel");
                break;
            case 2:
            	opcion=("tijeras");
        }
        return opcion;
    }
    public void setÉxitos() 
    {
        éxitos++;
    }
    public int getÉxitos() 
    {
        return(éxitos);
    }
    

}
