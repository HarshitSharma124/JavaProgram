public class MatrixMinus
 {
   public static void main(String args[])
   {



int a[][]={{4,6,9},{8,3,7},{1,0,9}};
	int b[][]={{10,8,2},{5,6,7},{3,5,10}};
	 int c[][]=new int[3][3]; 
	 for(int i=0;i<3;i++)
	 {
	   for(int j=0;j<3;j++)
	   {
	   c[i][j]=b[i][j]-a[i][j];
	   System.out.print(c[i][j]+" ");
	   }
	 System.out.println();
	 }
   }}