/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paterrn;

import static paterrn.Paterrn.i;
import static paterrn.Paterrn.j;
import static paterrn.Paterrn.num;

/**
 *
 * @author ddh09
 */
public class pascalstar {
    public pascalstar(int rows){
    
    
                for (i=1; i<= rows; i++){
                        for(j=1 ; j<=i;j++){

                            System.out.print("* ");

                        }
                        System.out.println();
                }
    
              /*  for (i=rows-1; i>=1; i--){
                    for(j=1;j<=i; j++){
                         System.out.print("* ");
                    }

                    System.out.println();

                        }*/
               
        

                // outer loop to handle lower part
                for (i = rows-1; i >= 1; i--) {

                    // inner loop to print stars
                    for (j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }

                    System.out.println();
                }
    
    
    
    
            }
    
        }
