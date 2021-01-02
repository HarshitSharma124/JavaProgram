public class HexaToBinary
{
public static void main(String args[])
{
 int HexaValue=80;
 String Deci=HexaDecimal(HexaValue);
 System.out.println(Deci);
 

}

static String HexaDecimal(int FirstValue)
{
	int rem=0;
	String FirstReturnValue="";
	char Bina[]={'0','1'};
	while(FirstValue!=0)
	{
		rem=FirstValue%2;
		FirstReturnValue=Bina[rem]+FirstReturnValue;
		FirstValue=FirstValue/2;

	}
	return FirstReturnValue;
  
}

}