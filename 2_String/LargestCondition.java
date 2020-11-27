public class LargestCondition
{
  public static void main(String args[])
  {
	  int a=10,b=90,c=180,big;
	  big=a>b?(a>c?a:c):(b>c?b:c);
	  System.out.println("the biggest number is "+big);
  }	
}