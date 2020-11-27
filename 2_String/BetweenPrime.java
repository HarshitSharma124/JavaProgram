//program number 30
//program to print the all prime numbers between 1 to 300.

 class BetweenPrime
{
   //static int Prime(int num)
   
  public static void main(String args[])
  {
  
   
   
   for(int i=1;i<=30;i++)
   {
	   int c=0;
    for(int j=2;j<i;j++)
   {
      if(i%j==0)
	  {
		  c++;
	  break;   
	  }
   }
   if(c==0)
   System.out.println("prime no beetween 1 to 300 is"+i);
   }  
  }
}