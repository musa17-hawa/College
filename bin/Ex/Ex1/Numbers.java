//imports.

import java.util.Scanner;
import java.lang.Math;

//making a class called Numbers || the same as the file name.
public class Numbers{

	//making a main class to run the code.
	public static void main(String[] args) {

		//making a scanner object to read the user's input and use it later.
		Scanner usrInp = new Scanner(System.in);
		System.out.println("Please enter a 3 digit number to check if its an Armstrong number: ");
		System.out.println("Please enter a 4 or 5 digit number to check if its a Palindrome number: ");
		//getting the input and putting it into a variable called n --> (integer).
		int n = usrInp.nextInt();
		

		//checking if the integer(n) is a 3 digit number.
		if (n >= 100 && n <= 999){

			//getting each digit from the integer(n).
			int digit1 = n/100;
			int digit2 = (n/10)%10;
			int digit3 = n%10;

			//doing the math to check if the intger(n) is an Armstrong number.
			if ((Math.pow(digit1,3) + Math.pow(digit2,3) + Math.pow(digit3,3)) == n){
				System.out.println("The number "+n+" is an Armstrong number.");
			}
			else{
				System.out.println("The number "+n+" is not an Armstrong number.");
			}


		}

		//if the integer(n) is *not* a 3 digit number then check if its a 4 digit number.
		else if(n >= 1000 && n <= 9999){

			//getting the digits from the integer(n).
			int firstDig = n/1000;
			int secondDig = (n/100)%10;
			int thirdDig = (n/10)%10;
			int fourthDig = n%10;

			//checking if this 4 digit number is a Palindrome number.
			if (firstDig == fourthDig && secondDig == thirdDig){
				System.out.println("The number " + n + " is a Palindrome.");
			}
			else{
				System.out.println("The number " + n + " is not a Palindrome.");
			}
		}

		//if the integer(n) is neither 3 nor 4 digit number then check if its a 5 digit number?.
		else if(n >=10000 && n <= 99999){

			/*geting the digits from the integer(n), we dont need the middle digit,
			because it doesnt matter */
			int firstDigit = n/10000;
			int secondDigit = (n/1000)%10;
			int fourthDigit = (n/10)%10;
			int fifthDigit = n%10;

			//checking only if the first two digits are the same as the last two digits.
			if (firstDigit == fifthDigit && secondDigit == fourthDigit){
				System.out.println("The number " + n + " is a Palindrome.");

			}
			else{
				System.out.println("The number " + n + " is not a Palindrome.");
			}
		}

		//if its not a 3 or 4 or 5 digit number then, there is nothing to do.
		else{
			System.out.println("The number "+n+" is invalid.");
			System.exit(0);
		}
	}
}