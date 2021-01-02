public class DeciBin
{
	public static void main(String args[])
	{
	 System.out.println("the octal value of the number is "+Bin(10));
     System.out.println("the octal value of the number is "+Bin(1020));
     System.out.println("the octal value of the number is "+Bin(90));	 
	}
	static String Bin(int Deci)
	{
	   int rem=0;
	   char BinChar[]={'0','1'};
       String Bin="";	   
		while(Deci>0)
		{
		  rem=Deci%2;
		  Bin=BinChar[rem]+Bin;
		  Deci=Deci/2;
		}
		return Bin;
	}
}