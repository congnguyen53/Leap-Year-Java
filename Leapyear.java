
/**
 * 
 * Cong Nguyen
 *
 */
import java.util.Scanner;

public class Leapyear
{
     public static void main(String[] args)
   {
          // Setting up scanner class
          Scanner scan = new Scanner(System.in);
          // Initiate year object
          int year;
          System.out.println("Please enter a year or enter 0 to terminate the program: ");
          // Ask the user to input a year
          year = scan.nextInt(); 
          // While loop, it will not stop until the user input 0
         while ( year != 0)
         {
          // If statement displaying the message if the user enter less than 1582   
          if ( year > 1582 )
          {
          // Testing if year is divisible by 4    
          if ( year%4 == 0)
          {
           // Testing if year is divisible by 100 and not by 400
           if ( year%100 == 0 && year%400 != 0)
           { System.out.println("Year " + year +  " is not a leap year");
            }
           // Testing if year is divisible by 100 and by 400           
           else if ( year%100 == 0 && year%400 == 0)
           { System.out.println("Year " + year +  " is a leap year"); }
           else 
           
           System.out.println("Year " + year +  " is a leap year");
        }
        else
        // If non of the aboves are satisfied this message will be displayed 
        
         System.out.println("Year " + year +  " is not a leap year");
        }
    
        else 
         System.out.println("Year " + year + " is before the Gregorian calendar was adopted");
        
        // Asking user to enter another year or enter 0 to terminate the program
        System.out.println();
        System.out.println("Enter another year or enter 0 to terminate the program");
        year = scan.nextInt();
        
        }
          
    }
}
