//import java.util.Scanner;
public class MatrixAddition
 {
   public static void main(String args[])
   {
    
    //Scanner sc=new Scanner(System.in);
	//int row=sc.nextInt();
	//int col=sc.nextInt();
    //System.out.println("enter row and colomn array  numbers);
	//int a[][]=new int[row][col];
	//int b[][]=new int[row][col];
	
	//System.out.println("enter first array  numbers);
	// for(int i=0;i<row;i++)
	//{
	   //for(int j=0;j<col;j++)
	   //{
	    //a[i][j]=sc.nextInt();
	 //}
	 //System.out.println();
	//}
	
	
	//System.out.println("enter second array  numbers);
	//for(int i=0;i<row;i++)
	 //{
	   //for(int j=0;j<col;j++)
	   //{
	   //b[i][j]=sc.nextInt();
	  //}
	  //System.out.println();
	 //}
    
	
	int a[][]={{1,2,3},{4,5,6},{7,8,9}};
	int b[][]={{1,2,3},{4,5,6},{7,8,9}};
	 int c[][]=new int[3][3]; 
	 for(int i=0;i<3;i++)
	 {
	   for(int j=0;j<3;j++)
	   {
	   c[i][j]=a[i][j]+b[i][j];
	   System.out.print(c[i][j]+" ");
	   }
	    System.out.println();
	 }
 }
 } 