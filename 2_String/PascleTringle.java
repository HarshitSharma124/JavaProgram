                             //program number 20
public class PascleTringle
{
 public static void main(String args[])
  {
	  System.out.println("enter the round of pascle Tringle" );
       int n=5,row;
	   // int m;
	
	for( row=0;row<n;row++)
	{
		for(int space=0;space<=n-row;space++)
		{
			System.out.print(" ");
		} 
		//m=1;
	    for(int col=0;col<=row;col++)
	    {
	        System.out.print(" "+ncr(row,col));
		    //System.out.print(m);
			//m=m*(i-k)/(k+1);
	    }
		System.out.println(" ");
   } 
 }
   static int Factorial(int n)
   {
	   int f;
	   for(f=1;n>1;n--)
	   {
		   f=f*n;
		   
	   }
	   return f;
   }
   static int ncr(int i,int j)
   { 
	   return Factorial(i)/(Factorial(i-j)* Factorial(j));
	
   }
}