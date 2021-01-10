/*
Write a program that reads a Celsius degree in a double value from the console, then converts it to Fahrenheit and displays the result. The formula for the conversion is as follows:
fahrenheit = (9 .0/ 5) * celsius + 32 
*/

import java.util.Scanner;

class CelsiusToF
 {
  public static void main(String args[])
   {
     double $_celsius;
     System.out.println("Enter the value which is *C:");
     Scanner in = new Scanner(System.in);
     $_celsius = in.nextDouble();
     System.out.println("So the Value in Fahrenheit is: "+ (9.0/5) * $_celsius+32);
   }
}