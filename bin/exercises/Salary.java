import java.util.Scanner;
public class Salary{
	public static void main(String[] args) {
		Scanner usrInput = new Scanner(System.in);
		System.out.println("Please enter your age: ");
		double age = usrInput.nextDouble();
		System.out.println("Please enter your monthly Salary: ");
		double salary = usrInput.nextDouble();
		if (age >= 18){
			System.out.println(salary-(salary*0.05));
		}
		else{
			System.out.println(salary);
		
		}
	}
}