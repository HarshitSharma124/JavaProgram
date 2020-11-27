//Basic_program number 4
public class StrongNumber 
{
 public static void main(String args[])
 {
	 
   int num=146,Strong=0,value;
   int demo=num;
   while(demo!=0)   
   {
	 System.out.println("the rem is "+num);
     value=1;
     int rem=demo%10;
     demo=demo/10;
     for(int i=rem;i>=1;i--)
      {
		  
          value=value*i;
		  
      }
     Strong=Strong+value;
   
   }
   
   if(num==Strong)
   {
	   System.out.println("the number is strong number "+num);
   }
   else
   {
	   System.out.println("the number is not Strong number "+num);
   }
   
   
 
 }
}