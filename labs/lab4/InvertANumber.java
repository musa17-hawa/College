import java.util.Scanner;
public class InvertANumber{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter a number to reverse it: ");

		int n = scan.nextInt();
		int orgn = n;
		int countern = n;

		int digit;
		int sum = 0;
		int counter = 0;
//_______________________________________________
		
		while(countern > 10){
			countern/=10;
			counter+=1;
		}

		while(n > 0){
			digit = n%10;
			sum += digit*(Math.pow(10,counter));
			counter -=1;
			n/=10;
		}
		System.out.println("the inverse num of " + orgn + " is " + sum);
	}
}