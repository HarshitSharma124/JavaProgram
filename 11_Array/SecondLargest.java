public class SecondLargest
{
	public static void main(String args[])
	{
		int arr[]={10,20,60,35,55,40,80,10,70};
		int demo=0;
		for(int i=0;i<arr.length;i++)
		{
		 for(int j=i+1;j<arr.length;j++)
			if(arr[i]<arr[j])
			{
				demo=arr[i];
				arr[i]=arr[j];
				arr[j]=demo;
				}
			 }
		
	    
		System.out.println("this is final Second largest element in  the array"+arr[1]);	
    }
}