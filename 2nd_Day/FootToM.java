//Convert From The Foot To meter from given Number (1 ft => 0.305m).

import java.util.Scanner;

class FootToM
{
   public static void main(String args[]) 
   {
     double num,InM;
     Scanner in = new Scanner(System.in);
     System.out.println("Enter the number for which you wants to change in meter:");
     num = in.nextDouble();
     InM =num * 0.305;
     System.out.println(num+" ft in m is: "+InM);
  }
} 
     
         