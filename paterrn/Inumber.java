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
public class Inumber {
    public Inumber(int rows) {
        
            for (i=1 ; i<=rows; i++){
             
            for (j=1 ;j<=i; j++){
                
             System.out.print(j+" ");

            }
      System.out.println();
        }
    }

}
