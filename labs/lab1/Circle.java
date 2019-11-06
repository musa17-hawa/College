
import java.util.Scanner;
//import java.lang.Math;
public class Circle {
	public static void main(String[] args) {
		double circ, area, pi = 3.141592654;
		Scanner usr = new Scanner(System.in);
		System.out.println("Please Enter The Radius: ");
		double r = usr.nextDouble();
		area = pi*(r*r);
		circ = 2*pi*r;
		System.out.println("The area of the circle is: "+area);
		System.out.println("The circumference is: "+ circ);
		
		
		
	}
}
