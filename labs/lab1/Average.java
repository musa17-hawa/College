import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		double avg;
		Scanner usrInp = new Scanner(System.in);
		System.out.println("All marks have to be between (0 - 100) including 0 and 100.");
		
		System.out.println("Please Enter The First Mark: ");
		double mark1 = usrInp.nextDouble();
		
		System.out.println("Please Enter The Second Mark: ");
		double mark2 = usrInp.nextDouble();
		
		System.out.println("Please Enter The Third Mark: ");
		double mark3 = usrInp.nextDouble();

		if (mark1 > 100 || mark1 < 0 || mark2 > 100 || mark2 < 0 || mark3 > 100 || mark3 < 0) {
			System.out.println("One or more of the marks were not VALID, Please Enter A Valid Mark.");
			System.exit(0);
		}
		
		avg = (mark1 + mark2 + mark3)/3;
		System.out.println("The average is: "+ avg );

	}

}
