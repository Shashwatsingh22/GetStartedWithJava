//Area of rectangle by length and breadth (in Double).
import java.util.Scanner;

class AreaRectangle
{
  public static void main(String args[])
  {
   double l,b;
   Scanner in= new Scanner(System.in);
   System.out.println("Enter the length of the Rectangle: ");
   l=in.nextDouble();
   System.out.println("Enter the length of the Rectangle: ");
   b=in.nextDouble();
   System.out.println("Area of the Rectangle is: "+ l * b);
  }
}