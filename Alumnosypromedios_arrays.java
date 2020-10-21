/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase6;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author AnaTevez
 */
public class Alumnosypromedios_arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner Entrada = new Scanner(System.in);
        int alum1 [], alum2 [], alum3 [], alum4 [], alum5 [];
        int num, i;
        int sumaalum1, sumaalum2, sumaalum3, sumaalum4, sumaalum5; 
        
        alum1 = new int[3];
        alum2 = new int[3];
        alum3 = new int[3];
        alum4 = new int[3];
        alum5 = new int[3];
       
        
                
                
        System.out.println("Alumno Uno :");
        for (i = 0; i < 3; i++) {
            System.out.print(" Notas (" + i + "): ");
            alum1[i] = Entrada.nextInt();
        }
        System.out.println("==================================");
        System.out.println("Alumno Dos :");
        for (i = 0; i < 3; i++) {
            System.out.print(" Notas (" + i + "): ");
            alum2[i] = Entrada.nextInt();
        }
        System.out.println("==================================");
        System.out.println("Alumno Tres :");
        for (i = 0; i < 3; i++) {
            System.out.print(" Notas (" + i + "): ");
            alum3[i] = Entrada.nextInt();
        }
        System.out.println("==================================");
        System.out.println("Alumno Cuatro :");
        for (i = 0; i < 3; i++) {
            System.out.print(" Notas (" + i + "): ");
            alum4[i] = Entrada.nextInt();
        }
        System.out.println("==================================");
        System.out.println("Alumno Cinco :");
        for (i = 0; i < 3; i++) {
            System.out.print(" Notas (" + i + "): ");
            alum5[i] = Entrada.nextInt();
        }

        sumaalum1 = 0;
        sumaalum2 = 0;
        sumaalum3 = 0;
        sumaalum4 = 0;
        sumaalum5 = 0;

        for (i = 0; i < 3; i++) {
            sumaalum1 += alum1[i];
            sumaalum2 += alum2[i];
            sumaalum3 += alum3[i];
            sumaalum4 += alum4[i];
            sumaalum5 += alum5[i];

        }
        System.out.println("==================================");
        
        System.out.println("La media del Alumno Uno : " + sumaalum1 / 3.0);
        
        System.out.println("La media del Alumno Dos : " + sumaalum2 / 3.0);
        
        System.out.println("La media del Alumno Tres : " + sumaalum3 / 3.0);
        
        System.out.println("La media del Alumno Cuatro : " + sumaalum4 / 3.0);
        
        System.out.println("La media del Alumno Cinco : " + sumaalum5 / 3.0);
        
        System.out.println("===========================================");

       
        
        
        
        
        
        
      
    }
    
}
