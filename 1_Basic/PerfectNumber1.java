//Basic program 1
public class PerfectNumber1
{
    public static void main(String args[])
	{
        int num=29,rem=0,count=1;
	    int demo=num;
        while(count<num)
	    {
			if(num%count==0)
			{
				rem=rem+count;
			}
			count++;
			}
			if(rem==num)
			{
				System.out.println(num+"the giving number is perfect number");
				}
				else
				{
					System.out.println(num+" the number is not perfect number");
					}
        }
}