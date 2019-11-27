import java.util.Scanner;

public class Same{
	public static void main(String[] args) {
		System.out.println(howManyDigitsAreTheSame(122222, 2));
	}

	public static String howManyDigitsAreTheSame(int x, int y){
		int orgx = x;
		if ((x < 999999 && x > 100000) && (y < 10 && y > 0)){

			int digit;
			int position = 0;
			int counter = 0;
			String str = "";

			while(x > 0){
				position+=1;
				digit = x%10;
				if (digit == y){
					counter += 1;
					str += (counter == 1) ? (7-position) : " and " + (7-position);
				}
				x/=10;
			}
			return "you have " + counter + " digits that are the same as "+y+" in the number "+orgx+" and their positions are "+ str;
		}
		return "please enter a valid number";
	}
}