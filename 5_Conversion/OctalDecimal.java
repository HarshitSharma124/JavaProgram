public class OctalDecimal {

    public static void main(String[] args) {
        int octal = 116;
        int decimal = convertOctalToDecimal(octal);
        System.out.printf("%d in octal = %d in decimal", octal, decimal);
    }

    public static int convertOctalToDecimal(int octal)
    {
        int decimalNumber = 0,base=1,rem=0;
		int Oct=octal;
      System.out.println("the "+ base +"base  value is ");
        while(Oct != 0)
        {
           
			rem=Oct% 10;
			decimalNumber=decimalNumber+rem*base;
            Oct=Oct/10;
			base=base*8;
			
        }

        return decimalNumber;
    }
}
