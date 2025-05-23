/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paterrn;

import static paterrn.Paterrn.i;
import static paterrn.Paterrn.j;
import static paterrn.Paterrn.rows;

/**
 *
 * @author ddh09
 */
 class pil {
      public pil(int rows){

          for (i = 1 ; i <= rows ; i++){
                for (j = 1; j <=  2 * ( rows - i ); j++){
                System.out.print(" ");
                }
                for (j = i; j >= 1; j--){
                System.out.print(j + " ");
                }
                for (j = 2; j <= i; j++){
                System.out.print(j + " ");
                }
            System.out.println("");
        }
        
        
    }
    
}
