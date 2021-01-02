public class HexaToDecimal
{
public static void main(String args[])
{
 int HexaValue=80;
 int Deci=HexaDecimal(HexaValue);
 System.out.println(Deci);

}

static int HexaDecimal(int FirstValue)
{
	int FirstReturnValue=0,base=1,rem=0;
	while(FirstValue!=0)
	{
		rem=FirstValue%10;
		FirstReturnValue=FirstReturnValue+rem*base;
		FirstValue=FirstValue/10;
		base=base*16;
	}
	return FirstReturnValue;
  
}

}