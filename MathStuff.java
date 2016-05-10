/*Josh Bishop
  Programming Fundamental Homework_8
  5 May 2013
  MathStuff.java
 */
public class MathStuff
{//start class
   //attribute(s)
   private int result, result1;
   //calculate the factorial and return the answer
   public int factorial(int f)
   {
      result = f;
      
      for(int i = 1; i < f; i++)
      {
         result *= i;
      }
      System.out.println("The answer is " + result); 
      return result;
   }
   //calculate the summation and return the answer
   public int summation(int s)
   {
      result1 = s;
      
      for(int i = 0; i < s; i++)
      {
         result1 += i;
      }
      System.out.println("The answer is " + result1); 
      return result1;
   }
   
}//end class