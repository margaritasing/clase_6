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
public class Creadordetablasycolumnas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese cantidad de filas: ");
        int n = scanner.nextInt();
        System.out.print("Ingrese cantidad de columnas: ");
        int m = scanner.nextInt();
// creo una matriz de n filas x m columnas
        int mat[][] = new int[n][m];
        int nro;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
// genero un numero aleatorio entre 0 y 1000
                nro = (int) (Math.random() * 1000);
// asigno el numero en la matriz
                mat[i][j] = nro;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
// imprimo la celda de la matriz
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
        
        
        
        
        
        
        
        
        // TODO code application logic here
    }
    
}
