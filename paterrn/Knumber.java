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
public class Knumber {
    public Knumber(int rows){
            for (i=rows;i>=1;i--){
            
                  for(j=1; j<=i;j++){
                      System.out.print(num+" ");
            num++;
                 }
            
            System.out.println();
            }
            
            for(i=2; i<=rows; i++){
            
                for(j=1; j<=i; j++){
                        System.out.print(num-2+" ");
                num--;
                
                
                }
                System.out.println();
            }
    
    
    }
}
