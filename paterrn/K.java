/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paterrn;

/**
 *
 * @author ddh09
 */

import static paterrn.Paterrn.i;
import static paterrn.Paterrn.j;
import static paterrn.Paterrn.k;
import static paterrn.Paterrn.num;


public class K {
    public K(int rows){
            for (i=rows;i>=1;i--){
            
                  for(j=1; j<=i;j++){
                      System.out.print("* ");
            
                 }
            
            System.out.println();
            }
            
            for(i=2; i<=rows; i++){
            
                for(j=1; j<=i; j++){
                        System.out.print("* ");
                
                
                
                }
                System.out.println();
            }
    
    
    }
    
}
