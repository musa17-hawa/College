import java.util.Scanner;

public class Odd{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		do{
			System.out.println("please enter a number : ");
			n = scan.nextInt();
		}while(n%2 == 0);
		System.out.println("the number "+n+" is Odd");
	}
}