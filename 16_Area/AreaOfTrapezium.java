//program number 4
//program to find the area of trapezium.
import java.util.Scanner;
public class AreaOfTrapezium
{
  public static void main(String args[])
  {
     int a;
	 Scanner sc=new Scanner(System.in);
	 int base1=sc.nextInt();
	 int base2=sc.nextInt();
	 int height=sc.nextInt();
	 a=AreaOfTrapezium(base1,base2,height);
	 System.out.println("the area of Trapezius is ="+a);
   
  
  
  }
  public static int AreaOfTrapezium(int b1,int b2,int h)
  {
     int AOTrapezius=((b1+b2)*h)/2;
	 return AOTrapezius; 
  }
  


}