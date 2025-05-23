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
//import static paterrn.Paterrn.String;



public class Pascal {
    public Pascal(int rows){
    
    for (i=1; i<=rows; i++){
            for(j=1 ; j<=i;j++){
            
                System.out.print(num+ " ");
                num++;
            }
            System.out.println();
    }
    
    for (i=rows; i>=1; i--){
        for(j=1;j<=i-1; j++){
         
             System.out.print(num - 5+ " ");
            num--;
        
            
        }
        
        System.out.println();
    
    }
    
    
    
    }
}
