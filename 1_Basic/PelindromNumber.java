//Basic_program number 7
public class PelindromNumber
{
	public static void main(String args[])
	{
		int num=12321,sum=0;
		int demo=num;
		while(demo!=0)
		{
		  int rem=demo%10;
		  demo=demo/10;
		  
		  sum=sum*10+rem;
		  System.out.println("the sum us"+sum);
		}
		if(num==sum)
		{
			System.out.println("the number is pelindrome");
		}
		else {
			System.out.println("the number in not pelindrome number");
		}
	}
}