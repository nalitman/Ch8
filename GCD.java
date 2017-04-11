
import java.util.Scanner;

public class GCD
{
   public static void main(String [] args)
   {
       int d, num1, num2;
       Scanner keys = new Scanner(System.in);
       
       System.out.print("Input a number: ");
       num1 = keys.nextInt();
       keys.nextLine();
       System.out.print("\nInput another number: ");
       num2 = keys.nextInt();
       
       if(num1 > num2 || num1 == num2)
        d = num2;
       else
        d = num1;
        
        System.out.println("The greatest common divisor between " + num1 + " and " + num2 + " is " + gcd(num1, num2, d));
    }
    
    public static int gcd(int num1, int num2, int d)
    {
        if(num1 % d == 0 && num2 % d == 0)
            return d;
        
        else
         {   return gcd(num1, num2, d - 1);
            }
        }
    }
