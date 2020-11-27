import java.util.Scanner;
public class Quadriatic_Equation
{
	public static void main(String args[])
	{
		Double root1,root2,root;
		Scanner sc=new Scanner(System.in); 
		Double a=sc.nextDouble();
		Double b=sc.nextDouble();
		Double c=sc.nextDouble();
		Double Discriminant=b*b-4*a*c;
		
		if(Discriminant>0)
		{
			root1=(-b-Math.sqrt(Discriminant))/ (2*a);
			root2=(-b+Math.sqrt(Discriminant))/ (2*a);
			System.out.println("the root value of first"+Math.round(root1*100)/100.00+"and second"+Math.round(root2*100)/100.0+"");
		}else if(Discriminant==0)
		{
			root1=root2=-b/(2*a);
			System.out.println("the root1=root2value of "+Math.round(root1*100)/100.0+"");
		}else 
		{
			double realPart=-b/(2*a);
			double ImgPart=Math.sqrt(-Discriminant)/(2*a);
			System.out.println("the realPart"+Math.round(realPart*100)*100.0+"Imp value"+Math.round(ImgPart*100)/100.0+"");
			
		}
		
	}
	
}
