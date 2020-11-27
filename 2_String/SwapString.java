//program number 37
// program for swapping of two string.
//Exception puchhna he.
import java.util.Scanner;
public class SwapString
{
	public static void main(String args[])
	{
		//String good="Good";
		//String morning="Morning";
		//System.out.println("good"+good);
		//System.out.println("morning"+morning);
		//System.out.println("before Swaping Strings");
		//String temp=good;
		//good=morning;
		//morning=temp;
		//System.out.println("After Swaping Strings");
		//System.out.println("good"+good);
		//System.out.println("Morning"+morning);
		
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		String c=a+b;
		System.out.println("the c="+c);
		
		b=a.substring(0,a.length()- b.length());
		System.out.println("b ="+b);
		
		a=a.substring(b.length());
		System.out.println("a ="+a);
		
		System.out.println(a+"      "+b);
	
	}
	
}
