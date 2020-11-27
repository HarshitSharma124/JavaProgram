//Basic_program number 6
public class AdditionOfGivenDigit
{
	public static void main(String args[])
	{
		int num=145,rem=0,AddNum=0;
		while(num!=0)
		{
			rem=num%10;
			num=num/10;
			AddNum=AddNum+rem;
		}
		
	System.out.println("the addition of digits of number"+AddNum);
	}
	
}