import java.util.*;
public class solution
{
    public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int n;
	n=sc.nextInt();
		int r,s=0,c;
		r=n;
	while(n>0)
	{
		s=s*10+n%10;
		n=n/10;
}
if(r==s)
{
    System.out.print("True");
}
else
{
    System.out.print("False");
}
}
}