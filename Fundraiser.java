

public class Fundraiser
{
   public static void main(String [] args)
   {
       int requirement = 1000, raised = 0;
       
       for (int i = 0; i < 10; i++)
       {
           raised += fatStacks(requirement);
        }
       System.out.print(raised + " has been raised");
    }
    
    public static int fatStacks(int stacks)
    {
        if(stacks == 0)
            return 1;
        
        else
            return stacks/10 - stacks/100 + fatStacks(stacks/10);
        }
}
