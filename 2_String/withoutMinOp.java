public class withoutMinOp
{

	static int Minu(int x,int y)
	    {    
	     
		         if (y == 0) {
				 return x; }
				 else
				 {
				 return Minu(x ^ y, (~x & y) << 1); 
				 }
        
		
		}
	       
		public static void main(String args[])
	    {
		System.out.println(Minu( 20,10));
	    }
}