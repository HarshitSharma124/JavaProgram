//farehnite to centigrade
//program number 44
import java.util.Scanner;

public class FtoC
{
 public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   int fare=sc.nextInt();
   
   int cent=(fare-32)*5/9;
   System.out.println(cent);
   
   int fari=(cent*9/5)+32;
   System.out.println(fari);
   
 
 }
}