//progrem number 7
//find the volume and surface area of cube
import java.util.Scanner;
public class SurAndVol
{
  public static void main(String args[])
   {
	 int a;
     Scanner sc=new Scanner(System.in);
	int length=sc.nextInt();
     int width=sc.nextInt();
     int height=sc.nextInt();
     //a=volume(length,width,height);  ----->type 1
	 //System.out.println(a);
	 
	 System.out.println(volume(length,width,height));//----->Type 2
	 //System.out.println(a);
	 Surface(length,width);
   }
    
	static int volume(int l,int w,int h)
	{
      int vol=l*w*h;
	  
	  //int sur=6*l*w;       ///------>type 1: for surface	
      //System.out.println("the surface area is = "+sur);
	  
	  
	  
	  return vol;
    }
	static void Surface(int le,int wi)//-------type 2:for surface
	{
	   int sur=6*le*wi;
      System.out.println("the surface area is = "+sur);	   
	   //return sur;
	}
	
}