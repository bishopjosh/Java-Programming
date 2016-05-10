/*Josh Bishop
  Programming Fundamental Homework_8
  5 May 2013
  TestMathStuff.java
 */
import java.util.*;

public class TestMathStuff
{//start class
   public static void main(String[] args)
   {//start main
      //Scanner and MathStuff class objects
      Scanner scn = new Scanner(System.in);
      MathStuff cal = new MathStuff();
      //attribute of valid to set the boolean
      boolean valid = true;
      
      do//just go ahead and do the whole thing
      {
         System.out.print("1 - Factorial\n2 - Summation\n\nPlease select a number of the operation you want to perform: ");
         int selection = scn.nextInt();
         
         if(selection == 1)//whole thing for this if statement is to selection of 1 (factorial)
         {
            System.out.print("Please enter a whole number: ");//prompt the user to enter a whole number
            int n = Math.abs(scn.nextInt());//user input... if you notice I use "Math.abs" it is used to change from negative to positive number
            cal.factorial(n);//variable deceleration
         }
         else if(selection == 2)//whole thing for this else-if statement is to selection of 2 (summation)
         {
            System.out.print("Please enter a whole number: ");//prompt the user to enter a whole number
            int n = Math.abs(scn.nextInt());//user input... if you notice I use "Math.abs" it is used to change from negative to positive number
            cal.summation(n);//variable deceleration
         }
         else//else statement is to prompt the user to enter the proper input
         {
            System.out.print("1 - Factorial\n2 - Summation\n\nInvalid input, please select a number of the operation you want to perform: ");
            selection = scn.nextInt();
            break;
         }
         scn.nextLine(); 
         System.out.print("Do you want to do this again? (y or n): ");//prompt the user to see if the user wants to do the whole thing again
         String again = scn.nextLine();//user's input
        
        //if-else statement to verify the user's input so if the user enter 'y' then proceed
         if(again.charAt(0) == 'y')
         {
            valid = true;
         }
         else
         {
            valid = false;
         }
      }while(valid == true); 
      
   }//end main
}//end class
