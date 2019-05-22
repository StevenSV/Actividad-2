/**
 * Simula el juego de Piedra, Papel o tijera
 */


package ende;

public class Juego 
{
	static Jugador P2=new Jugador();
    static Jugador P1=new Jugador();
    static boolean FIN_DEL_JUEGO=false;  
    static Integer RONDAS_JUGADAS = 0;    // Número de rondas jugadas
    static Integer EXITOS_JUGADOR1=P2.exitos;
    static Integer EXITOS_JUGADOR2=P1.exitos;
    static Integer EMPATES = 0;
    
    static String opcionJugador1;
	static String opcionJugador2;
    
    public static void main(String args[])
    {
        // Bucle de juego
        do
        {
            System.out.println("***** Ronda: " + RONDAS_JUGADAS+" *********************\n");
            System.out.println("Numero de empates: "+ EMPATES + "\n");
            opcionJugador1=P2.opcion_al_azar();
            System.out.println("Jugador 1: " + opcionJugador1+"\t Jugador 1 - Partidas ganadas: " + EXITOS_JUGADOR1);
            opcionJugador2 = P1.opcion_al_azar();
            System.out.println("Jugador 2: " + opcionJugador2+"\t Jugador 2 - Partidas ganadas: " + EXITOS_JUGADOR2);
            
            if((opcionJugador1.equals("piedra"))&&(opcionJugador2.equals("papel")))
            {
                System.out.println("Jugador 2 GANA");
                EXITOS_JUGADOR2 = ++P1.exitos;
                
            }
            else if((opcionJugador1.equals("papel"))&&(opcionJugador2.equals("piedra")))
            {
            	EXITOS_JUGADOR1 = ++P2.exitos;
                System.out.println("Jugador 1 GANA");
            }
            else if((opcionJugador1.equals("piedra"))&&(opcionJugador2.equals("tijeras")))
            {
            	EXITOS_JUGADOR1 = ++P2.exitos;
                System.out.println("Jugador 1 GANA");
            }
            else if((opcionJugador1.equals("tijeras"))&&(opcionJugador2.equals("piedra")))
            {
            	EXITOS_JUGADOR2 = ++P1.exitos;
                System.out.println("Jugador 2 GANA");
            }
            else if((opcionJugador1.equals("tijeras"))&&(opcionJugador2.equals("papel")))
            {
            	EXITOS_JUGADOR1 = ++P2.exitos;
                System.out.println("Jugador 1 GANA");
            }
            else if((opcionJugador1.equals("papel"))&&(opcionJugador2.equals("tijeras")))
            {
            	EXITOS_JUGADOR2 = ++P1.exitos;
                System.out.println("Jugador 2 GANA");
            }
            if(opcionJugador1==opcionJugador2)
            {
            	EMPATES++;
                System.out.println("\n\t\t\t Empate \n");
            }
            RONDAS_JUGADAS++;
            if((P2.exitos>=3)||(P1.exitos>=3))
            {
            	FIN_DEL_JUEGO=true;
                System.out.println("FIN DEL JUEGO!!");
            }
            System.out.println();
        } while(FIN_DEL_JUEGO!=true);
    }
}
