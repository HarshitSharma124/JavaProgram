//Basic_program number 3
public class PrimeNumber
{
  public static void main(String args[])
  {
  int number=5;
  boolean Prime=false;
  for(int i=2;i<=number/2;i++)
  {
	System.out.println(number);
    if(number%i==0)
     {
		 System.out.println(number);
	  Prime=true;
	  break;
	  }
   }
  if(!Prime)
  {
	  System.out.println("the number is prime "+number);
  }
  else
  {
	  System.out.println("the number is not prime "+number);
  }
  }
}