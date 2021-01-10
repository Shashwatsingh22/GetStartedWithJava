//Find the Avg of the Five Numbers.
import java.util.Scanner;

class AvgOfFiveNum 
   {
     public static void main(String args[])
     {
       double num1,num2,num3,num4,num5;
       Scanner in = new Scanner(System.in);
       System.out.println("Enter the Five Numbers: ");
       num1 = in.nextDouble();
       num2 = in.nextDouble();
       num3 = in.nextDouble();
       num4 = in.nextDouble();
       num5 = in.nextDouble();
       System.out.println("So, the Avg of the Five Numbers are: "+ (num1+num2+num3+num4+num5)/5);
     }
}
