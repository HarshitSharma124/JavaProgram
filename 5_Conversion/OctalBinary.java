public class OctalBinary {

    public static void main(String[] args) {
        int octal = 116;
         String decimal = convertOctalToBinary(octal);
        System.out.println("octal value in decimal value"+octal+" "+ decimal);
    }

    public static String convertOctalToBinary(int octal)
    {
        int decimalNumber = 0,rem=0;
		int Oct=octal;
		String Bin="";
		char charOct[]={'0','1'};
        while(Oct != 0)
        {
           
			rem=Oct% 2;
			Bin=charOct[rem]+Bin;
            Oct=Oct/2;
		
			
        }

        return Bin;
    }
}