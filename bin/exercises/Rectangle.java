import java.util.Scanner;

public class Rectangle{

	public static void main(String[] args) {

		Scanner usrInp = new Scanner(System.in);

		System.out.println("Please enter the width of the Rectangle: ");
		int w = usrInp.nextInt();
		
		System.out.println("Please enter the hieght of the Rectangle: ");
		int h = usrInp.nextInt();

		System.out.println("The Area of the Rectangle is: " + (w*h));
		System.out.println("The circumfrence of the Rectangle is: " + ((h+w))*2);


		
	}
}