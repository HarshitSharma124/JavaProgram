public class BinOct
{
	public static void main(String args[])
	{
		int a=1010,b=1110,c=0001;
		int octo=(Bin(a));
		System.out.println("the oct is"+Oct(octo));
		//System.out.println("the Decimal value of binary number"+Bin(b));
		//System.out.println("the Decimal value of binary number"+Bin(c));
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
	static int Bin(int Binary)
	{
		int x=Binary,base=1,Deci=0;
		while(x>0)
		{
			int rem=x%8;
			Deci=Deci+rem*base;
			x=x/8;
		    base=base*8;
		}
	
			return Deci;
	}
		
	}
	
	