package pruebacraps;
import java.util.Random;

//* @author Manuel Salgado Enríquez */

public class Craps {
    
    Random numerosAleatorios = new Random();
    
    private enum Estado {CONTINUA, GANA, PIERDE}
    
    private final static int DOS_UNOS = 2;
    private final static int TRES = 3;
    private final static int SIETE = 7;
    private final static int ONCE = 11;
    private final static int DOCE = 12;
    
    public void jugar(){
        int miPunto = 0; 
        Estado estadoJuego;
        
        int sumaDeDados = tirarDados();
        
        switch(sumaDeDados){
            case SIETE:
            case ONCE:
                estadoJuego = Estado.GANA;
                break;
            case DOS_UNOS:
            case TRES:
            case DOCE:
                estadoJuego = Estado.PIERDE;
                break;
            default:
                estadoJuego = Estado.CONTINUA;
                miPunto = sumaDeDados;
                System.out.printf("EL punto es %d\n", miPunto);
                break;
        }
        
        while (estadoJuego == Estado.CONTINUA){
            sumaDeDados = tirarDados();
            
            if(sumaDeDados == miPunto){
                estadoJuego = Estado.GANA;     
            } else if (sumaDeDados == SIETE) {
                estadoJuego = Estado.PIERDE;
            }
            
            if (estadoJuego == Estado.GANA){
                System.out.println("EL jugador gana");
            } else if (estadoJuego == Estado.PIERDE){
                System.out.println("El jugador pierde");
            }
        }
        
    }

    public int tirarDados(){
        int dado1 = 1 + numerosAleatorios.nextInt(6);
        int dado2 = 1 + numerosAleatorios.nextInt(6);
        int suma = dado1 + dado2;
        System.out.printf("EL jugador tiró %d+%d=%d\n", dado1, dado2, suma);
        return suma;
    }
    
}
