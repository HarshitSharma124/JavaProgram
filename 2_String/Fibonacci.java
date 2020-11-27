//program number 25
//program to print Fibonacci series of given range.
import java.util.Scanner;
public class Fibonacci
{
     
   //static int Fabo(int m,int n)
   //
	   //int c;
      //return c=m+n; 
	   
   //
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
      int a=0,b=1,c=0;
     //System.out.println(a);
     //System.out.println(b);
  //System.out.println(Fabo(a,b));
  
      for(int i=1;i<=n;i++)
       {
	      System.out.println(a);
          c=a+b;
	      a=b;
	      b=c;
	   //System.out.println(a);
	   }
  
 }
}