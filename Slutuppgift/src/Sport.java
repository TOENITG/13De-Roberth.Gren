import java.util.Scanner;


public class Sport {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner user_input = new Scanner(System.in);
    
    boolean X= true;
   
    
    
    do {
        
    String first_question;
    System.out.println("Which month does the Russian celebrates the October Revolution?");
    first_question = user_input.nextLine();
    
    if (first_question.equalsIgnoreCase("November")){
         System.out.println("Right answer!") ;       
    }else{
       System.out.println("Wrong answer,in November");
    }
    
    String second_question;
    System.out.println("How many active users do World of Warcarft have?");
    second_question = user_input.nextLine();

    if (second_question.equalsIgnoreCase("7 million")){
         System.out.println("Right answer!") ;       
    }else{
       System.out.println("Wrong answer, 7 million players");
    }
    
    String third_question;
    System.out.println("How many Swedish soldiers helped the Finnish army during the Second world war?");
    third_question = user_input.nextLine();
    
    if (third_question.equalsIgnoreCase("8000")){
         System.out.println("Right answer!") ;       
    }else{
       System.out.println("Wrong answer,8000 soldiers");
    }
    
    String forth_question;
    System.out.println("How many Nuclear bombs were dropped at the end of World War Two?");
    forth_question = user_input.nextLine();
    
    if (forth_question.equalsIgnoreCase("Two") || forth_question.equalsIgnoreCase("2")){
         System.out.println("Right answer!") ;       
    }else{
       System.out.println("Wrong answer, two bombs were dropped");
    }
    
    String fifth_question;
    System.out.println("How many russian died during the Second World War?");
    fifth_question = user_input.nextLine();
    
    if (fifth_question.equalsIgnoreCase("24 million")){
         System.out.println("Right answer!") ;       
    }else{
       System.out.println("Wrong answer, 24 million people");
    }
    
    String sixth_question;
    System.out.println("5+5=?") ;
    sixth_question = user_input.nextLine();         
    
    if (sixth_question.equalsIgnoreCase("10")){
         System.out.println("Right answer!") ;       
    }else{
       System.out.println("Wrong answer, 10");
    }
    
    String seventh_question;
    System.out.println("Who made this code?");
    seventh_question = user_input.nextLine();
    
    if (seventh_question.equalsIgnoreCase("Roberth") || seventh_question.equalsIgnoreCase("Roberth Green")){
         System.out.println("Right answer!") ;       
    }else{
       System.out.println("Wrong answer, Robban made this code");
    
    String restart_1;
    System.out.println("Would you like to try again?");
    restart_1 = user_input.nextLine();
     
    if (restart_1.equalsIgnoreCase("No")){
       break;
    }
    }
    }
    while (X= true);
    }
}
    
