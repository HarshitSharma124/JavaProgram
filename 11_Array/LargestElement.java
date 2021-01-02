public class LargestElement
{
	public static void main(String args[])
	{
		int arr[]={10,20,30,35,55,40,10,80};
		int Larger=arr[0];
        for(int i=1;i<=arr.length-1;i++)
		 {
			if(arr[i]>Larger)
		     {
				Larger=arr[i];
	         }
	     }
	    System.out.println("this is final largest element in  the array"+Larger);	
    }
}