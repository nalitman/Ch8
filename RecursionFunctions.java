
public class RecursionFunctions
{
    public static void main(String[] args)
    {
        nums(5);
        System.out.println("\n");
        nums2(5);
    }
    
    public static void nums(int num)
    {
        if(num >= 0)
        {
            System.out.print(num + " ");
            nums(num - 1);
        }
    }
    
    public static void nums2(int num)
    {
        if(num >= 0)
        {
            nums(num - 1);
            System.out.print(num + " ");
        }
    }
    
    
}
