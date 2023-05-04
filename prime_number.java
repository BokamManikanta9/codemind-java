import java.util.*;
public class solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int c=0;
        for(int i=1;i<=n;i++)
        {
        if(n%i==0)
        {
            c++;
        }
        }
        if(c==2)
        {
            System.out.print("prime");
        }
        else
        {
            System.out.print("not a prime");
        }
    }
}