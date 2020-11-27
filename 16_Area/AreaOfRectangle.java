//program number 
//program to find the area of rectangle
import java.util.Scanner;
public class AreaOfRectangle
{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   int height=sc.nextInt();
   int breaths=sc.nextInt(); 
System.out.println(AreaOfRectangle(height,breaths));   
  }
  static int AreaOfRectangle(int h,int b){
        int area=h*b;
  return area;
  }
    //return area;
}