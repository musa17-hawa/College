import java.lang.Math;
import java.util.Scanner;

public class Test{
	public static void main(String[] args) {
		Account a = new Account();

		// a.num=1;
		// a.balance = 11;
		
		System.out.println(a);
		a.deposit(500);
		double left = a.howMuchToWithdraw();
		System.out.println("you have " + left + " in your bank account");

		
		
	}
	
}