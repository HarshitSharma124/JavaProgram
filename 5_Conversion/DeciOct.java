//Decimal To Octal
//Question number 2
public class DeciOct
{
	public static void main(String args[])
	{
	 System.out.println("the octal value of the number is "+Oct(10));
     System.out.println("the octal value of the number is "+Oct(1020));
     System.out.println("the octal value of the number is "+Oct(90));	 
	}
	static String Oct(int Deci)
	{
	   int rem=0;
	   char OctChar[]={'0','1','2','3','4','5','6','7'};
       String Oct="";	   
		while(Deci>0)
		{
		  rem=Deci%8;
		  Oct=OctChar[rem]+Oct;
		  Deci=Deci/8;
		}
		return Oct;
	}
}