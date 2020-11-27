//program number 51
//program to convert the string from lower case to upper case.
import java.util.Scanner;
public class UtoL
{
 public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   String a=sc.nextLine();
   char[] change=a.toCharArray();
   for(int i=0;i<change.length;i++)
   {
    if(change[i]>='a' && change[i]<='z')
	{
	  change[i]=(char)((int)change[i]-
	  32);
	 
	}
	System.out.println(change[i]);
   
   }   
   
 }


}