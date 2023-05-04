import java.util.*;
public class main
{
    public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
	
	int n;
	n=sc.nextInt();
		int r,s=0;
	while(n!=0)
	{
		r=n%10;
		s=s*10+r;
		n=n/10;
		//s=n;
	}	
	System.out.print(s);
}
}