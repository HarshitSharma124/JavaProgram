public class SquarOf2
{
	public static void main(String args[])
	{
		int num=10,base=1,sum=0;
		for(int i=1;i<=num;i++)
		{
			sum=sum+base;
			base=base*2;
		}
		System.out.println(sum);
		
	}
	
}
