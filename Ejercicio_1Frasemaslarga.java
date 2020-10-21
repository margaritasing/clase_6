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
public class Ejercicio_1Frasemaslarga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       // String str = "Hello, World!";
       // System.out.println(str.length());
             
       // for(int x=0;x<.length();x++)
       
       Scanner entrada = new Scanner(System.in);
       String p1;
       String p2;
       
       
        System.out.print("Escribe una frase:");
        p1 = entrada.nextLine();

        System.out.print("Escribe otra frase:");
        p2 = entrada.nextLine();

       // int caracteres = caracter.length();
        //System.out.println("Cantidad de letras:" + "\t " + caracteres);

                 
            if (p1.compareTo(p2) < 0) {
                System.out.println("La primera frase es menor");
            } else {
                System.out.println("La primera frase es mayor");
            }
        
        
        
        
        
        
        
        
        
        
        
        
        

               }
           }
       
       
       
       
       
       
        
        
 