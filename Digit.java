import java.util.*;

public class Digit
{
    public static void main( String [] args)
    {
        Scanner keys = new Scanner(System.in);
        int ech;
        
        System.out.print("Input a number you scum: ");
        ech = keys.nextInt();
        
        System.out.println("This number has " + doTheThing(ech) + " digits");
    }

    public static int doTheThing(int num)
    {
        if (num < 10)
            return 1;
            
        else
            return 1 + doTheThing(num/10);
    }
}
