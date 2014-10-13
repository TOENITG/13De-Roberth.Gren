/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inlupp1;

import java.util.Scanner;

/**
 *
 * @author Blondie
 */
public class Uppgift1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    
   Scanner user_input = new Scanner(System.in);
  
   
   String first_name;
   System.out.print("Enter your first name: ");
   first_name = user_input.next(); 
   
   String family_name;
   System.out.print("Enter your family name: ");
   family_name = user_input.next();
   
   String full_name;
   full_name = first_name+" "+family_name;
   
   String adress;
   System.out.print("Enter your adress: ");
    adress= user_input.next();
   
    System.out.println("Välkommen "  +  full_name  + " " + adress );
   
  
   
   
    
    }
    
}
