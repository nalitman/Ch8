

public class Fundraiser
{
   public static void main(String [] args)
   {
       int requirement = 1000, count = 0;
       
       int gubs = fatStacks(requirement);
       System.out.print(gubs + " has been raised");
    }
    
    public static int fatStacks(int stacks)
    {
        if(stacks <= 0)
            return 1;
        
        else
        {
            for(int i = 0; i < 10; i++)
            {
                
            return 1 + fatStacks(stacks/10);
        
    }
        
}
