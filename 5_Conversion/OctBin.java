//program to convert octal number to binary number.
public class OctBin
{
	public static void main(String args[])
	{
		int O=12;
		//String A=Octal(Oct);
		System.out.println(Octal(O));
		
	}
	public static int Octal(int Oc)
	{
		int rem=0,Di=Oc,base=1,sum=0;
		//char OctChar[]={'0','1','2','3','4','5','6','7'};
		//String sum="";
		 while(Di>0)
		 {
			 rem=Di%8;
			 sum=sum+rem*base;
			 Di=Di/8;;
			 base=base*8;
		 }
		 return sum;
	}
}