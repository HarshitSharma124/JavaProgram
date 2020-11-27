public class LargerValue
{
	public static void main(String args[])
	{
		int arr[]={10,20,30,35,55,40,10,80};
		//int a=arr.length;
		int Larger=0;
		for(int i=0;i<arr.length;i++)
		{
			if(Larger<arr[i])
		     {
				Larger=arr[i];
	           
				
				
			}
			
	  }
	  System.out.println("Largest"+Larger);
	}
}