//program number 33
//c program to find out H.C.F. of two numbers
public class Lowest_CF
{
  public static void main(String args[])
  {
	int a=4;
	int b=6;
	for(int i=1;i<=a*b;i++)
	{
		int c=0;
		if(i%a==0 && i%b==0)
		{
			c++;
			
		}
		if(c==1)
		{
			System.out.println("the least common factor is"+i);
			break;
		}
	}
  }
}