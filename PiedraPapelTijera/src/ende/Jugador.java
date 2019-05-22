/**
  * Escoge piedra, papel o tijera al azar
  */

package ende;

public class Jugador {
	
	Integer i = (int) (Math.random() * 3);
    String OPCION = ""; 
    
    int exitos;      // número de partidas ganadas
    int winTotal;
    
    public Jugador() {
    	
    }
    
    public String opcionAlAzar()
    {
        switch (i) {
            case 0:
            	OPCION = ("piedra");
                break;
            case 1:
            	OPCION = ("papel");
                break;
            case 2:
            	OPCION = ("tijeras");
        }
        return OPCION;
    }
    public void setExitos() 
    {
        exitos++;
    }
    public int getExitos() 
    {
        return(exitos);
    }
    

}
