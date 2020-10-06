 import java.util.Scanner;
/**
 *This program prints out the factors of a positive integer 
 * @author Zach ramirez 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create a scanner for user input
    Scanner input = new Scanner(System.in); 
    
    //declare the integer variable
    int integer;
    //question loop
    do{ 
     //ask user for positive integer 
     System.out.println("Please enter a positive integer to determine its factors:"); 
      integer = input.nextInt(); 
     //determine whether the user inputed a positive or negative integer 
      if(integer >= 0){ 
      } 
    }
    //outside the loop means user has entered positive integer
    while(integer < 0); 
    System.out.println("The factors of " + integer + " are: ");
    
    //create a variable to keep track of the number 
    int count = 1;
    int remainder =  integer % 2;
    
    //using a loop to count the factors 
    while(count <= integer){
      System.out.println(count); 
      if(remainder >= 0) 
      integer = integer + remainder;
      System.out.println(integer);
        
    } 

    
  }
}
