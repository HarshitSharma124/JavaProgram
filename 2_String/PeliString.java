import java.util.Scanner;
public class PeliString 
{
 public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   String name=sc.nextLine();
   
   char[] word=name.toCharArray();
   String reverse="";
   //System.out.println(word.length-1);
   for(int i=word.length-1;i>=0 ;i--)
   {
	   reverse=reverse+word[i];
   }
   System.out.println("the input string"+name);
   System.out.println("the out String is "+reverse);
   if(name.equals(reverse))
   {
	   System.out.println("the given string is pelindrom  ");
   }
   else
   {
	   System.out.println("the given String is not pelindrome ");
   }
   sc.close();
   
   
 } 
 }
