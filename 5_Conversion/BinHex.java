public class BinHex
{
	public static void main(String args[])
	{
		
		int Bin=1010;
	    int A = Hexa(Bin);
	  //int B = Bina(A);
	 // System.out.println("the Hexa value is "+B);
     System.out.println("the Hexa value is "+Bina(A));	  
		
	}
	public static String Bina(int Deci)
	{
		int rem=0;
		char HexChars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		String Hex="";
		while(Deci>0)
		{
		 rem=Deci%16;
		 Hex=HexChars[rem]+Hex;
		 Deci=Deci/16;
		}
		return Hex;
	}
	//public static String Bina(int Deci)
     //{
	    //int rem=0;
	    //char hexaChars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	   //  String Hex="";
	  //while(Deci>0)
	 //{
	       // rem=Deci%16;
		  //Hex=hexaChars[rem]+Hex;
		 //Deci=Deci/16;
		//}
	   //return Hex;
      // }
	static int Hexa(int Bn)
	{
		int x=Bn,rem=0,base=1,HexSum=0;
		while(x>0)
		{
			rem=x%16;
			HexSum=HexSum+rem*base;
			x=x/16;
			base=base*16;
		}
		return HexSum;
	}
}