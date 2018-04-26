import java.util.Scanner; 
import java.util.Random; 
/**
 *
 * @author quantum
 */
public class GuessingGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      boolean wonGame = false; 
      
       Random randomInt = new Random();
       Scanner sc = new Scanner(System.in); 
       int correct = randomInt.nextInt(10); 
      //System.out.println(correct); used to validate number guessed
      
       
       System.out.println("I'm thinking of an integer in the range of 1 and 10. You have 3 guesses");
      
      for(int i=0; i<3; i++){ 
          
         
      while(wonGame == false) { 
       
          if(i == 0){ 
          System.out.println("Enter your first guess:");
        } else if(i == 1) { 
          System.out.println("Enter your second guess:");
        } else if(i == 2) { 
          System.out.println("Enter your third guess:"); 
      
      } 
        
        int estimate = sc.nextInt(); 
        if(estimate == correct){ 
            wonGame = true; 
            System.out.println("Correct");
        } else if(estimate > correct) { 
            System.out.println("Your guess is too high");
        } else if(estimate < correct) { 
            System.out.println("Your guess is too low");
            
        }
        break;
      } 
        
      } 
      if(wonGame == true) { 
      System.out.println("You win"); 
      } 
      else { 
      System.out.println("You lose");
      System.out.println("The correct number is " + correct);
      }
    
    
}
    } 

