//Program number 34
//program to find out G.C.D. of two numbers.
public class Greatest_CF
{
	public static void main(String args[])
	{
		int a=24,b=60;
		for(int i=a<b?a:b;i>1;i--)
		{
			int c=0;
			if(a%i==0 && b%i==0)
			{
				c++;
				
			} 
			if(c==1)
			{
				System.out.println("the greatest common dividend is "+i);
				break;
			}
		}
	}
	
}