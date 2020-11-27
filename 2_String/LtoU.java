//program number 50
//lower to Upper casea
//printing confution
import java.util.Scanner;
public class LtoU
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter a String ");
		String name=sc.next();
		char[] change=name.toCharArray();
		for(int i=0;i<change.length;i++)
		{
			if(change[i]>='A' && change[i]<='Z')
			{
				change[i]=(char)((int)change[i]+32);
				//System.out.print(change[i]);
			}
			System.out.print(change[i]);
		}
		//System.out.println("the lower String is");
		//for(int i=0;i<change.length;i++)
		//{
			//System.out.print(change[i]);
		//}
		
		
	}
	
		
	
}