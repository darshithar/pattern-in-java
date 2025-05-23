/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paterrn;

import static paterrn.Paterrn.i;
import static paterrn.Paterrn.j;

/**
 *
 * @author ddh09
 */
class triangle {
    public triangle(int rows) {
    
        for(i = 1 ; i<=  rows; i++){
            for(j = 1 ; j<= rows - i ; j++){
                System.out.print(" ");
            }
            for(j = 1; j <= i; j++){
                System.out.print(i +" ");
            }
                System.out.println(); 
            }
        // outer loop to handle number of rows
       /* for (i = 1; i <= rows; i++) {
            
            // inner loop to print space
            for (j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            
            // inner loop to print star
            for (j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            
            // print new line for each row
            System.out.println();
        }*/
    
    }
    
}
