import java.util.Scanner; 


/**
 *
 * @author quantum
 */
public class input {

  
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 
        // TODO code application logic here
        System.out.println("Enter the length and width of the lot, in feet:");
        double lotLength = sc.nextDouble(); 
        double lotWidth = sc.nextDouble(); 
        double lotArea = lotLength*lotWidth;   
        
        System.out.println("Enter the length and width of the house, in feet:");
        double houseLength = sc.nextDouble(); 
        double houseWidth = sc.nextDouble(); 
        double houseArea = houseLength*houseWidth; 
        double lawnArea = lotArea-houseArea; 
       
        if (houseArea > lotArea) { 
        System.out.println("The area of the house is greater than that of the lot which "
                + "the house is built on, please input a different value and start again"); 
        } else { 
        System.out.println("The area of the lawn to be mowed is:");
        System.out.println(lawnArea + " square feet"); 
        
        System.out.println("Enter the mow rate, in square feet per second:");
        double mowRate = sc.nextDouble();
        
        double timeinSeconds = lawnArea/mowRate; 
        
        int seconds, hours, minutes; 
        seconds = (int) Math.round(timeinSeconds); 
        minutes = seconds/60; 
        seconds = seconds%60; 
        hours = minutes/60;
        minutes = minutes%60;
       
        
      System.out.println("The mowing time is " +hours+" hours, "+minutes+" minutes and "+seconds+" seconds");
      
          }
    } 
 
    
}

