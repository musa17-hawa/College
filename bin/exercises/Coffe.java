import java.util.Scanner;

public class Coffe{
	public static void main(String[] args) {
		Scanner usrInput = new Scanner(System.in);
		System.out.println("Please enter your choice: 1.big / 2.meduim / 3.small ");
		int choice = usrInput.nextInt();
		switch(choice){
			case 1:
				System.out.println("The price for the big cup is: 15 NIS");
				break;
			case 2:
				System.out.println("The price for the big cup is: 13 NIS");
				break;
			case 3:
				System.out.println("The price for the big cup is: 8 NIS");
				break;

		}

		
	}
}