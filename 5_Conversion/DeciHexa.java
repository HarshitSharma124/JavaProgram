//Decimal to hexaDecimal
//progaram number 1
public class DeciHexa
{
  public static void main(String args[])
  {
	  System.out.println("the Hexa value of 90 is"+Hexa(90));
	  System.out.println("the Hexa value of 1020 is"+Hexa(1020));
	  System.out.println("the Hexa value of 10 is"+Hexa(10));
  }
  
  public static String Hexa(int Deci)
  {
	  int rem=0;
	  char hexaChars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	  String Hex="";
	while(Deci>0)
	   {
		 rem=Deci%16;
		 Hex=hexaChars[rem]+Hex;
		 Deci=Deci/16;
		 
	   }
	   return Hex;
  }

}