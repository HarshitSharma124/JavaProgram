import java.util.Scanner;
public class floyds_Tringle
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for (int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
				n++;
			}
			System.out.println();
		}
		
		
	}
}