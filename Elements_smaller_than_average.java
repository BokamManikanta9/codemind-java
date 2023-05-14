import java.util.*;
public class solution
{
    public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int n,i;
    n=sc.nextInt();
    int a[]=new int[n];
    for(i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }

    int s=0,k=0;
    float avg;
    for(i=0;i<n;i++)
    {
        s=s+a[i];
    }
    avg=s/n;
    for(i=0;i<n;i++)
    {
        if(a[i]<=avg)
        {
            k++;
        }
        
    }
    System.out.print(k);
}
}