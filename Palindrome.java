import java.util.Scanner;

public class Palindrome
{
    public static void main( String [] args)
    {
        Scanner keys = new Scanner(System.in);
        String word;
        boolean p = false;
        boolean b;
        
        System.out.print("Input a word in all lowercase: ");
        word = keys.nextLine();
        
        b = tester(word, 0, p);
        
        if (b)
            System.out.println(word + " is a palindrome");
            
        else
            System.out.println(word + " is not a palindrome");
        
        
    }
    
    public static boolean tester(String word, int num, boolean p)
    {
        
            
            if(word.charAt(num) == word.charAt(word.length() - num - 1))
            {
                p = true;
                
            }
            else
                p = false;
            
            if(!p)
                return p;
               
                if(num + 1 < word.length() - 1)
                p = tester(word, num + 1, p);
            return p;
                
            
        }
            
}


