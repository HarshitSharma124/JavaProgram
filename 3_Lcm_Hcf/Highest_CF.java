//program number 2
//program to find out L.C.M. of two numbers
//import java.util.Scanner;
public class Highest_CF
{
public static void main(String args[])
{
//Scanner sc=new Scanner(System.in);
int a=6;     /*sc.nextInt();*/
int b=4;  /*sc.nextInt();*/
for(int h=a<b?a:b; h>1;h--)
{
	if(a%h==0 && b%h==0)
	{
		System.out.println("this value is highest common factor between two numbers"+h);
	}
	
}

}

}