
import java.util.Scanner;

public class IN2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner user_input = new Scanner(System.in);
   
   
   
   System.out.print("Enter the first number: ");
   double first_number = user_input.nextDouble();
    
   
   System.out.print("Enter the second number: ");
   double second_number = user_input.nextDouble();
   
   double answer = first_number + second_number;
   System.out.println("Addition:" + answer);
   
   
   System.out.print("Enter the third number: ");
   double third_number = user_input.nextDouble();
   
   answer = answer - third_number;
   System.out.println("Subraktion:" + answer);
   
   System.out.print("Enter the forth number: ");
   double forth_number = user_input.nextDouble();
    
   answer = answer * forth_number;
   System.out.println("Multipliaktion:" + answer);
   
   System.out.print("Enter the fifth number: ");
   double fifth_number = user_input.nextDouble();
    
   answer = answer / fifth_number;
   System.out.println("Divison: " + answer);
   
    }
    
    
}
