//to add complex numbers
package shubhangijava;
import java.util.Scanner;
class Complex {
		int real;
		int img;
		public Complex() {}
		public Complex(int r,int i) {
		real = r;
		img = i;
	}
	public void show() {
		System.out.println("The number are :"+real+ "+" +img+ "i");
	}
	public void Sum(Complex o1, Complex o2) {
		real = o1.real + o2.real;
		img = o1.img +o2.img;
	}
}
public class AddComplexNumber {
	public static void main(String[] args)
	{
		Complex c1= new Complex(73,95);
		c1.show ();
		Complex c2 = new Complex(44,25);
		Complex c3 = new Complex();
		c3.Sum(c1,c2);
		c3.show();
	}
}