/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author Blondie
 */
public class UP1 {

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
  
   String age;
   System.out.print("Enter your date of birth: ");       
   age = user_input.next(); 
   String birthday = age.substring(2, 6) ;
   
   String adress;
   System.out.print("Enter your adress: ");
    adress= user_input.next(); 
   
    /**
     * Sorry, men fattar inte hur man får in fler packages i en kod..
     * Men jag tror att jag fatttar uppgift 2.
     * 
     */
    
    
    System.out.println("Välkommen "  +  full_name  +"," +" Eftersom att du fyller år den " + birthday +" så kommer vi och firar din på addressen:" + adress );
   
  
   
    
    }
    
}
