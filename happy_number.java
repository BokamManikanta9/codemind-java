import java.util.*;
public class solution
{
    public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int n,s=0,t,r,y=0,k=0;
    n=sc.nextInt();
    while(y<=10)
    {
        while(n>0)
        {
            r=n%10;
            s=s+r*r;
            n=n/10;
        }
        if(s==1 || s==7)
        {
            System.out.print("True");
            k++;
            break;
        }
        y++;
        n=s;
        s=0;
    }
    if(k==0)
    {
        if(s!=1 || s!=7)
        {
            System.out.print("False");
        }
    }
}
}