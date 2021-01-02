//Program number 36
// program for swapping of two arrays.
import java.util.Scanner;
public class ArraySwap
{
public static void main(String args[])
{
  int size,i;
  Scanner sc=new Scanner(System.in);
  System.out.println("Please enter the size of array");
  size=sc.nextInt();
  int a[]=new int[size];
  int b[]=new int[size];
  System.out.print(" Please Enter " + size + " elements of First Array  : ");
  for( i=0;i<size;i++)
  {
    a[i]=sc.nextInt();
  }
  System.out.print(" Please Enter " + size + " elements of Second Array  : ");
  for( i=0;i<size;i++)
  {
    b[i]=sc.nextInt();
  }
  for(i=0;i<size;i++)
  {
    a[i]=a[i]+b[i];
	b[i]=a[i]-b[i];
	a[i]=a[i]-b[i];
 }
System.out.println("the First swapped array is");
PrintArray(a,size);
System.out.println("the second Swapped array is ");

PrintArray(b,size);
}
public static void PrintArray(int[] Array,int size)
{
	for(int number:Array)
	{
		System.out.print(number+" ");
	}
	//return 0;
}


}