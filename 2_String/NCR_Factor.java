//program number 24
//program to find out NCR factor of given number
public class NCR_Factor
{
	
	    static int Fact(int num)
		{
			int i=1;
			 while(num!=0)
			 {
				 i=i*num;
				 num--;
			}
			return i;
		}
		static int nCr(int n,int r)
		{
			//System.out.println(n);
		   return Fact(n)/(Fact(r)*Fact(n-r));
		}
		
	public static void main(String args[])
	{
		int n=6,r=4;
		System.out.println(nCr(n,r));
	
	}
}