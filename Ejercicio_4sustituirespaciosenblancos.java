/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase6;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author AnaTevez
 */
public class Ejercicio_4sustituirespaciosenblancos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner ( System.in);
        String str = ""; 
        
        
        System.out.println(" Introduce una frase");
        str = entrada.nextLine();
        
        String str2 = str.replaceAll("\\s", "*");
        System.out.println(str2);
        
        
        
        
        
        
        
        
        
        
        
        
       
    }
    
}
