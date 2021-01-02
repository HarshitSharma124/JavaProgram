public class OctalHexaDecimal {

    public static void main(String[] args) {
        int octal = 116;
         //String decimal = convertOctalToHexaDecimal(octal);
		 int Decimal = convertOctalToDecimal(octal);
         String Hexa=convertOctalToHexaDecimal(Decimal);
		 System.out.println(Hexa);
    }
	static int convertOctalToDecimal(int num)
	{
		int rem=0,OctDeci=0,base=1;
		while(num != 0)
        {
            rem=num% 10;
			OctDeci=OctDeci+rem*base;
            num=num/10;
			base=base*8;
        }
		return OctDeci;
	}
    
	public static String convertOctalToHexaDecimal(int OctDec)
    {
        int decimalNumber = 0,rem=0;
		int Oct=OctDec;
		String Bin="";
		char charOct[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(Oct != 0)
        {
           
			rem=Oct% 16;
			Bin=charOct[rem]+Bin;
            Oct=Oct/16;
		
			
        }

        return Bin;
    }
}