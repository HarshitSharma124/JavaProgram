public class GenericRoot
{
	public static void main(String args[])
	{
		int num=12345,rem=0,addition=0,GenericRoot=0;;
		int demo=num;
		while(demo!=0)
		{
			rem=demo%10;
			demo=demo/10;
			addition=addition+rem;
		}
		System.out.println(addition);
		if(addition>=9)
		{
			int value=addition;
			int Grem=0;
			while(value!=0)
			{
				Grem=value%10;
				value=value/10;
				GenericRoot=GenericRoot+Grem;
			}
		}
		System.out.println("the generic root of the"+num+" is "+GenericRoot);
		
	}
}