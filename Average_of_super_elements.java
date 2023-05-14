import java.util.*;
public class solution
{
    public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int n,i,j,e=0,c;
    n=sc.nextInt();
    float a[]=new float[n];
    float avg=0;
    for(i=0;i<n;i++)
    {
        a[i]=sc.nextFloat();
    }
    for(i=0;i<n;i++)
    {
        c=0;
        for(j=0;j<n;j++)
        {
            if(a[i]==a[j])
            {
                c++;
                if(i!=j)
                {
                    a[j]=0;
                }
            }
        }
        if(c==a[i])
        {
avg=avg+a[i];
e++;
        }
    }
    if(e>0)
    {
        avg=avg/e;
        System.out.format("%.2f",avg);
    }
    else
    {
        System.out.print("-1");
    }
}
}