//Here , We will what is the Actual use of the Final Keyword
import java.util.Scanner;

class FinalKeywordUse
  {
    public static void main(String args[])
    {
      final double pi=3.1457;
      double r;
      System.out.println("Enter the Radius to find the Volume: ");
      Scanner in = new Scanner(System.in);
      r=in.nextDouble();
      System.out.println("So, the Volume for the Given Radius is:"+ pi*r*r*r);
    }
}