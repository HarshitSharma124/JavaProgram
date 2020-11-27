//Program number 23
//find out prime factor of given number.
public class PrimeFactor
{
 public static void main(String args[])
 {
   int num=24,value;
   
   
   for(int i=1;i<=num/2;i++)
   {
    if(num%i==0)
    { 
	  System.out.println(i);
    } 
   }
 }
}