/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicionumero4;

import java.util.Scanner;

/**
 *
 * @author yojan
 */
public class EjercicioNumero4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada= new Scanner (System.in);
        System.out.println(" ingrese los kilos de manza que va a llevar");
        float frutas;
        frutas = entrada.nextInt();
        entrada.nextLine();
        float precio = 10000;
        float descuento;
        float total = 0;
     
        
        if (frutas < 2){
            total = frutas * precio;
        } else if (frutas >= 2 && frutas < 5){
            descuento = (float)(precio *0.10);
            total = precio - descuento; 
        }else if (frutas >= 5.01 && frutas <10){
            descuento = (float) (precio * 0.15);
            total= precio- descuento;
        } else if (frutas >= 10){
            descuento = (float) (precio * 0.20);
            total= precio- descuento;
        
        System.out.println(" el total de su cuenta es: " + total);
        
    }
    }
    
}
