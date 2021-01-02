import java.util.Scanner;
public class Nnumber2Sum
{
	public static void main(String args[])
	{
		int sum=0;
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
		{
			sum=sum+i*2;
		}
		System.out.println(sum);
		
    }
}