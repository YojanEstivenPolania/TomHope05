
import java.util.Scanner;


/**
 *
 * @author yojan
 */
public class EjerciciosNumero2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner entrada= new Scanner (System.in); 
        System.out.println("escribe un la cantidad de llantas que necesitas que necesitas");  
        int llantas;
        llantas = entrada.nextInt();
        entrada.nextLine();
        int precio = 100;
        int total= 0;
        
        if (llantas < 5 ){
            total = llantas * precio;
        } else if ( llantas >=5 && llantas  <10){
        total = llantas * (precio - 25); 
        } else if ( llantas >=10){
        total = llantas * (precio - 50); 
        
        
    }
        System.out.println("el precio por llanta es: " + precio);
        System.out.println(" el precio total con promocion aplicada es: " + total);
    }
    
    
}
