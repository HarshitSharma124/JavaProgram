//program number 27
//program to check given year is leap year or not.
import java.util.Scanner;
public class LeapYear
{
   public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);
    int Year=sc.nextInt();
	if(Year%4==0)
	{
	  System.out.println("Year is leap year"+Year);
	}
	else
	{
	  System.out.println("year is not leap year "+Year);
	}
   }

}