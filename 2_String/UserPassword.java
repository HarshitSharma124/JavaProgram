//program number 28
// function program which takes password from user
import java.util.Scanner;
public class UserPassword
{
  public static void main(String args[])
  {
    
	Scanner sc=new Scanner(System.in);
	System.out.println("please enter your password");
	int password=sc.nextInt();

	 
	  if(password==1234)
	   {
	    System.out.println("the password is successfully submitted");
	   }
	  else
	   {
	    System.out.println("you enter wrong Password");
	   }
	
  
  }
}