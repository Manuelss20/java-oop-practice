
package instrucciones;

/* @author Manuel Salgado Enríquez */

public class Instrucciones {

    public static void main(String[] args) {
        /* int cuenta; // la variable de control también la usamos cuando termina el ciclo
        
        for (cuenta = 1; cuenta <= 10; cuenta++){
            if (cuenta == 5)
                break;
            System.out.printf("%d", cuenta);
        }
        
        System.out.printf("%nSalio del ciclo en cuenta = %d%n", cuenta); */
        
        for (int cuenta = 1; cuenta <=10; cuenta ++){
            if(cuenta == 5)
                continue; // omitir el resto del código en ciclo
            System.out.printf("%d", cuenta);
        }
        
        System.out.println("\nSalio uso continue para omitir e imprimir 5%n");
    }
    
}
