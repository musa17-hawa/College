import java.util.Scanner;

public class TempChanger{

	public static void main(String[] args) {
		Scanner usrInput = new Scanner(System.in);
		double n = 9;
		System.out.println("Please enter the temperature in Celsius: ");
		double tempInC = usrInput.nextDouble();
		System.out.println("The temperature in Celsius is: "+tempInC+" degrees, and the temperature in Fahrenheit is : "+(n/5)*tempInC+32 +" degrees");
		
		

		
	}
}