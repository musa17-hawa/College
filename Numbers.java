import java.util.Scanner;
import java.lang.Math;


public class Numbers{
	public static void main(String[] args) {
		Scanner usrInp = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int n = usrInp.nextInt();

		if (n >= 100 && n <= 999){
			int digit1 = n/100;
			int digit2 = (n/10)%10;
			int digit3 = n%10;
			if ((Math.pow(digit1,3) + Math.pow(digit2,3) + Math.pow(digit3,3)) == n){
				System.out.println("The number "+n+" is an Armstrong number.");
			}
			else{
				System.out.println("The number "+n+" is not an Armstrong number.");
			}


		}
		else if(n >= 1000 && n <= 9999){
			int firstDig = n/1000;
			int secondDig = (n/100)%10;
			int thirdDig = (n/10)%10;
			int fourthDig = n%10;
			if (firstDig == fourthDig && secondDig == thirdDig){
				System.out.println("The number " + n + " is a palindrome.");
			}
			else{
				System.out.println("The number " + n + " is not a palindrome.");
			}
		}
		else if(n >=10000 && n <= 99999){
			int firstDigit = n/10000;
			int secondDigit = (n/1000)%10;
			int fourthDigit = (n/10)%10;
			int fifthDigit = n%10;
			if (firstDigit == fifthDigit && secondDigit == fourthDigit){
				System.out.println("The number " + n + " is a palindrome.");

			}
			else{
				System.out.println("The number " + n + " is not a palindrome.");
			}
		}

		
		else{
			System.out.println("The number "+n+" is invalid.");
			System.exit(0);
		}
	}
}