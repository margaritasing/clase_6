/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase6;

import java.util.Scanner;

/**
 *
 * @author AnaTevez
 */
public class Ejercicio_2reemplazodeminusculas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado=new Scanner(System.in);
        String apellnom ;
                      
        System.out.print("Ingrese el nombre y apellido:");
        apellnom=teclado.nextLine();
                
        String e = apellnom.replaceAll("[aeiouAEIOU]", "");
        System.out.println(e);
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
