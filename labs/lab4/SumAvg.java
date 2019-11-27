import java.util.Scanner;
public class SumAvg{
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double n;
		double sum = 0;
		int counter = 0;
		double min = 100;
		do{
			System.out.println("The mark is: ");
			n = scan.nextDouble();
			if(n >= 0 && n <= 100){
				sum+=n;
				counter+=1;
				System.out.println("the sum is now : "+sum);
				min = (n < min) ? n : min;
				System.out.println("the min is now : "+min);
			}
		}while(n != -1);



		System.out.println("the average is: "+(sum/counter)+" and the lowest is : "+min);
	}
}