import java.util.Scanner;
public class DiagonalSum
{
	public static void main(String args[])
	{
		int sum=0;
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[3][3];
		System.out.println("enter the elements");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=sc.nextInt();
				System.out.print(" "+a[i][j]+" ");
				if(i==j)
				{
					sum=sum+a[i][j];
				}
				
			}
			System.out.println();
		}
	System.out.println("the addition is = "+sum);
		
	}
	
}