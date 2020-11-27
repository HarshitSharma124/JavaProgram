import java.util.Scanner;
public class ArithmaticGenerator
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int d=sc.nextInt();
		int n=sc.nextInt();
	    ArithGene(a,n,d);
		
		
		
	}
	static void ArithGene(int a,int n,int d)
	{
		int N=1,i;
		for( i=1;i<=n;i++)
		{
			System.out.print(a+((N-1)*d)+" ");
			N++;		
		}
		
	} 
}