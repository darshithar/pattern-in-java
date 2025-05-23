/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paterrn;

import java.util.Scanner;
import static paterrn.Paterrn.i;
import static paterrn.Paterrn.j;
import static paterrn.Paterrn.num;
import static paterrn.Paterrn.rows;


/**
 *
 * @author ddh09
 */
public class Paterrn {
        static Scanner sc = new Scanner (System.in);
        
        
        static int rows ,i,j,k,num=1,ch;
        static String sv= new String(); 
    public static void main(String[] args) {
        
              
        
            System.out.println("1. Incresing Pramid");
            System.out.println("2. Decresing Pramid");
            System.out.println("3. Incresing Number");
            System.out.println("4. Decresing Number");
            System.out.println("5. Triangle");
            System.out.println("6. Number Change");
            System.out.println("7. Palindrome Triangle");
            System.out.println("8. Pascal Triaangle");
            System.out.println("9. Pascal Star");
            System.out.println("10. K Star");
            System.out.println("11. K number");
            System.out.print("Enter choice: ");
            
            ch = sc.nextInt();
        
            System.out.print("Enter the number of Row: ");
            rows= sc.nextInt();
            switch(ch){
                case 1:
                    incresing inc = new incresing(rows);
                    
                    break;
                case 2:
                     decresing dec = new decresing(rows);
                    break;
                case 3:
                    Inumber in = new Inumber(rows);
                    break; 
                case 4:
                    Dnumber dn = new Dnumber(rows);
                    break;     
                case 5:
                    triangle t = new triangle(rows);
                    break;
                case 6:
                    numberchange n = new numberchange(rows);
                    break;
                case 7:
                    pil p = new pil(rows);
                    break;
                case 8:
                    Pascal pa = new Pascal(rows);
                    break;
                case 9:
                    pascalstar ps = new pascalstar(rows);
                    break;
                case 10:
                    K k = new K(rows);
                    break;
                case 11:
                    Knumber kn = new Knumber(rows);
                    break;    
                default :
                    System.out.println("Invalid Choice you select");
                    break;
      
            }           
           sc.close();
    }
    
}