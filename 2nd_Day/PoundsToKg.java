/*
Write a program that converts pounds into kilograms. The program prompts the user to enter a number in pounds, converts it to kilograms, and displays the result. One pound is 0.454 kilograms.
*/

import java.util.Scanner;

class PoundsToKg
 {
   public static void main(String args[])
   {
    double pounds;
    System.out.println("Enter the Value of Pounds: ");
    Scanner in = new Scanner(System.in);
    pounds = in.nextDouble();
    System.out.println("So the Value in Kg is : "+ pounds*0.454);
   }
}