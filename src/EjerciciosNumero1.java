/*En una tienda de computadoras se planea ofrecer a los clientes un descuento que dependerá
del número de equipos que compre. Si las computadoras son menos de cinco se les dará un
10% de descuento sobre el total de la compra; si el número de computadoras es mayor o igual
a cinco pero menos de diez se le otorga un 20% de descuento; y si son 10 o más se les da un
40% de descuento. El precio de cada computadora es de U$500.*/
import java.util.Scanner;


/**
 *
 * @author yojan
 */
public class EjerciciosNumero1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner (System.in); 
        System.out.println("escribe un la cantidad de computadores que necesitas");
         int computadora;
       computadora=entrada.nextInt();
       entrada.nextLine();
       
       int precio=0; 
       int descuento=0;
       int total=0;
       
       if (computadora <5){
           precio= computadora*500;
           descuento= (int)(precio* 0.10);
           total= precio- descuento;
       }else if (computadora>= 5 && computadora <10){
           precio = computadora *500;
           descuento= (int)(precio* 0.20);
           total= precio- descuento;
       } else if (computadora >=10){
          precio = computadora *500;
           descuento= (int)(precio* 0.30);
            total= precio- descuento;
       }
          
        System.out.println("El precio total de los computadores es: " + precio); 
        System.out.println("el valor del descuento es: " + descuento);
        System.out.println("el total con descuento aplicado es: " + total);
           
           
        
       }
    }
    

