
package tirodedados;
import java.util.Random;

/* @author Manuel Salgado Enríquez */

public class TiroDeDados {


    public static void main(String[] args) {
        
        Random numeroAleatorio = new Random();
        
        int f1 = 0, f2 = 0, f3 = 0, f4 = 0, f5 = 0, f6 = 0, cara;
        
        for (int tiro = 1; tiro <= 6000; tiro++){
            cara = 1 + numeroAleatorio.nextInt(6);
            
            switch(cara){
                case 1:
                    ++f1;
                    break;
                case 2:
                    ++f2;
                    break;
                case 3:
                    ++f3;
                    break;
                case 4:
                    ++f4;
                    break;
                case 5:
                    ++f5;
                    break;
                case 6:
                    ++f6;
                    break;
                
            }
        }
        
        System.out.println("cara\tfrecuencia");
        System.out.printf("1\t%d\n2\t%d\n3\t%d\n4\t%d\n5\t%d\n6\t%d\n", f1,f2,f3,f4,f5,f6);
        
    }
    
}
