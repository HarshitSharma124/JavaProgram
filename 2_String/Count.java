//program number 53
//program to count the different types of characters in given string.
import java.util.Scanner;
public class Count
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  String name=sc.nextLine();
  char[] ch=name.toCharArray();
  int j=0,k=0;
  for(int i=0;i<ch.length;i++)
  {
     //int j=0,k=0;
    if(ch[i]>='a' && ch[i]<='z')
	  {
	    ++j;
      }
	else if(ch[i]>='A' && ch[i]<='Z')
	   {
	     ++k;
	   }
	//System.out.println("number of capital letter"+j);
	//System.out.println("number of Small letter"+k);
  }System.out.println("number of capital letter"+k);
	System.out.println("number of Small letter"+j);   
 }
}