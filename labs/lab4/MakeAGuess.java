import java.util.Scanner;
public class MakeAGuess{
	public static void main(String[] args) {
		double number = (int)(Math.random() * 1000);
		Scanner scan = new Scanner(System.in);
		int n;
		do{
			System.out.println("Please enter a number between 1 and 1000");
			n = scan.nextInt();
			if(n > number){
				System.out.println("you gotta go lower");
			}
			else{
				System.out.println("you gotta go higher");
			}

		}while(n != number);
		System.out.println("woohoo you got it");
	}
}