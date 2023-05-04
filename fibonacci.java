import java.util.*;
public class sol
{
    public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
	int n,i,a,b,c;
	n=sc.nextInt();
	a=0;
	b=1;
	for(i=1;i<=n;i++)
	{
		System.out.print(a+" ");
		c=a+b;
		a=b;
		b=c;
	}
}
}