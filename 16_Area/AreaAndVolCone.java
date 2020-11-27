//number of program is 8
// the surface area and volume of a cone
import java.util.Scanner;
public class AreaAndVolCone
{
 public static void main(String args[])
 {
	 
   Scanner sc=new Scanner(System.in);
   int slant=sc.nextInt();
   int height=sc.nextInt();
   int radius=sc.nextInt();
   double a=volume(radius,slant,height);
   System.out.println("he volume is"+a);
} 
 static double volume(int rad,int sl,int heig )
 {
	double r=3.14;
	double volOfCone=((r*rad*sl)+(r*rad*rad));
    double sur=((3.14*rad*rad*heig)/3);
     System.out.println("the surface is = "+sur);	
	//System.out.println(volOfCone);
	return volOfCone;
  }
  


}