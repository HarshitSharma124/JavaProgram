public class ReverseByRecursion
{
	public static void main(String args[])
	{
		int a=1234;
		System.out.println("the main value is "+a);
		int c=Reverse(a);
		System.out.println("the reverse number is"+c);
	}
	static int Reverse(int b)
	{
		int rem=0,rev=0;
		while(b!=0)
		{
			rem=b%10;
			rev=rev*10+rem;
			b=b/10;
        }
		return rev;
	}
}