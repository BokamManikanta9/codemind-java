import java.util.*;
public class solution
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int n,q,i,s=0;
    n=sc.nextInt();
    q=n;
    for(i=1;i<n;i++)
    {
        if(q%i==0)
        {
            s=s+i;
        }
    }
    if(s>n)
    {
        System.out.print("True");
    }
    else
    {
        System.out.print("False");
    }
}
}