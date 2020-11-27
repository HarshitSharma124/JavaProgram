//program to convert binary number to decimal number.
//program numbe 4
public class BinDeci
{
	public static void main(String args[])
	{
		int a=1010,b=1110,c=0001;
		System.out.println("the Decimal value of binary number"+Bin(a));
		System.out.println("the Decimal value of binary number"+Bin(b));
		System.out.println("the Decimal value of binary number"+Bin(c));
	}
	static int Bin(int Binary)
	{
		int x=Binary,base=2,Deci=0;
		while(x>0)
		{
			int rem=x%10;
			Deci=Deci+rem*base;
			x=x/10;
			base=base*2;
		}
	
			return Deci;
	}
		
	}
	
	