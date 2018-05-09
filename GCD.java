//GCD.java
//Akhil Varanasi
//Finds GCD, error correction for inputs 


package gcdmethod2;
import java.util.Scanner; 
/**
 *
 * @author quantum
 */
public class GCDMethod2 {

    /**
     * @param x
     * @param y
     * 
     * 
     */
  
            
    public static void main(String[] args) {
        // TODO code application logic here
        
     Scanner sc = new Scanner(System.in); 
     System.out.println("Enter a positive integer"); 
     
     while(true) {  
         while (!sc.hasNextInt()) { 
             sc.next(); 
             System.out.println("Enter a positive integer");
         }
         break; 
     } 
    int x = sc.nextInt(); 
    
    System.out.println("Enter another positive integer");
    
    while(true) {  
         while (!sc.hasNextInt()) { 
             sc.next(); 
             System.out.println("Enter another positive integer");
         }
         break; 
     } 
    int y = sc.nextInt(); 
     

       System.out.println("GCD of two numbers" + x + "and " + y + "is" + GCD(x, y));
        
        
        

    }
    
   
      public static int GCD(int x, int y) { 
    
          if(y == 0) {
             return x;
          }
          
          else { 
              return GCD(y,x%y);
          } 
         
   
}
}
    
