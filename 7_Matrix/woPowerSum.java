import java.util.Scanner;
public class woPowerSum
{
	public static void main(String args[])
	{
		int sum=0,num=2;
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<=n;i++)
		{
			sum=sum+i*num;
		}
		System.out.println(sum);
		
    }
}