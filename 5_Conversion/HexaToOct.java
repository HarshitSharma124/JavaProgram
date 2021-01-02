public class HexaToOct
{
public static void main(String args[])
{
 int HexaValue=80;
 String Deci=HexaDecimal(HexaValue);
 System.out.println("the Decimal value "+Deci);
//String Oct=HexaOctal(Deci);
 //System.out.println("the oct value is"+Oct);

}

static String HexaDecimal(int FirstValue)
{
	int FirstReturnValue=0,base=1,rem=0;
	while(FirstValue!=0)
	{
		rem=FirstValue%10;
		FirstReturnValue=FirstReturnValue+rem*base;
		FirstValue=FirstValue/10;
		base=base*16;
	}
	System.out.println("the first decimal value is "+FirstReturnValue);
	return HexaOctal(FirstReturnValue);
  
}
static String HexaOctal(int Octal)
{
	    int rem=0,base=1;
		char HexChars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		String Hex="";
		while(Octal!=0)
		{
		 rem=Octal%8;
		 Hex=HexChars[rem]+Hex;
		 Octal=Octal/8;
		 
		}
		System.out.println("the octal value is"+Hex);
		return Hex;
	}
	
}

