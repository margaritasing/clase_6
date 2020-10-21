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
public class Ejercicio_5clavedeacceso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int password;
        int intentos = 1;
        int maximo = 3;

        Scanner teclado = new Scanner(System.in);

        do {

            System.out.print("Introduzca su contraseña: ");
            password = teclado.nextInt();

            if (intentos == 3) {
                System.out.println("Acceso denegado");
                intentos = intentos - maximo;
                break;
            }
            intentos++;

            if (password != 123) {
                System.out.println("Contraseña Incorrecta");
            }

        } while (password != 123);
      

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       
    }
    
}
