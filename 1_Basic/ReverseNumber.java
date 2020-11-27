//Basic_program number 5
public class ReverseNumber
{
  public static void main(String args[])
  {
    int num=145,rem=0,Reverse=0;
	while(num!=0)
	{
	  rem=num%10;
	  num=num/10;
	  Reverse=Reverse*10+rem;
	  
	}
	System.out.println("the reverse Number of the given number"+Reverse);
  }
}