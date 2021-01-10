//Area of the Circle.

import java.util.Scanner;


class AreaOfCircle 
  {
    public static void main(String args[])
    {
      double r,pi=3.14;
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the Radius of the Circle:");
      r=in.nextDouble();
      System.out.println("Area of the Circle by the Given Radius is: "+ pi*r*r);
    }
}
      
      