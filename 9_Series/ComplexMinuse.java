class Complex {
    int real, imaginary;	                // Declaring variables
     Complex() // Empty Constructor
	{}

     Complex(int tempReal, int tempImaginary) {      // Constructor to accept
     real = tempReal;                                // real and imaginary part
     imaginary = tempImaginary;
	}

     Complex addComp(Complex C1, Complex C2) // Defining addComp() method
     {                                         // for adding two complex number
      Complex temp = new Complex();            // creating temporary variable
	  temp.real = C1.real - C2.real;// adding real part of complex numbers
	  temp.imaginary = C1.imaginary - C2.imaginary;// adding Imaginary part of complex numbers
	  return temp;// returning the sum
	}
}

// Main Class
public class ComplexMinuse {
	public static void main(String[] args) // Main function
	{
        Complex C1 = new Complex(3, 2);   
		  System.out.println("Complex number 1 : " + C1.real + " + i" + C1.imaginary);
		Complex C2 = new Complex(9, 5);
		  System.out.println("Complex number 2 : " + C2.real + " + i" + C2.imaginary);
		Complex C3 = new Complex();
		C3 = C3.addComp(C1, C2);
		  System.out.println("Sum of complex number : " + C3.real + " + i" + C3.imaginary);
	}
}