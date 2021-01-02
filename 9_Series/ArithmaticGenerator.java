import java.util.Scanner;
public class ArithmaticGenerator
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=1,d=1,n=10;
	    ArithGene(a,n,d);
		
		
		
	}
	static void ArithGene(int a,int n,int d)
	{
		int i,N=1;
		for( i=1;i<=n;i++)
		{
			System.out.print(a+((N-1)*d)+" ");
			N++;		
		}
		
	} 
}