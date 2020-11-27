//Basic program 2
public class Armstrong
{
  public static void main(String args[])
  {
    int num=379,rem=0,arm=0;
	int demo=num;
	while(demo!=0){
	
	rem=demo%10;
	System.out.println("the rem is "+rem);
	demo=demo/10;
	System.out.println("the demo is "+demo);
	arm=arm+rem*rem*rem;
	}
	if(num==arm)
	{
	  System.out.println(num+"the number is armstrong number");
	}
	else
	{
	System.out.println(num+"the number is not armstrong number");}
	
  } 
}