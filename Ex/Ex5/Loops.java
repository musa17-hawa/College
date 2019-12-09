public class Loops{
	public static void main(String[] args) {
			specialMult(111);
			printAllSpecialMult(37);
			System.out.println("\n");
			printWithComma(12345678, 1);
	}
/*_________________________________________________________

				needed methods Created by me
___________________________________________________________*/

// a method to count how many digits are in any given number n
	public static int howManyDigits(int n){
		int counter = 0;
		while(n > 0){
			n/=10;
			counter+=1;
		}
		return counter;
	}

// a method to calculate the sum of digits in any given number
	public static int sumOfDigits(int n){
		int sum = 0;
		while(n > 0){
			sum += n%10;
			n /= 10;
		}
		return sum;
	}

// a method that returns the last (n number) in x
	public static int finalDigits(int x, int n){
		int lastdigit = 0;
		for(int i = 0; i < howManyDigits(n); i++){
			lastdigit += x%10 * (Math.pow(10,i));
			x /= 10;
		}return lastdigit;
	}

/*_________________________________________________________

						Question 1
___________________________________________________________*/

	public static int specialMult(int n){ // part 1
		if(n >= 1 && n <= 9){
			return n;
		}

		else if(n == 11){
			return 0;
		}

		else{
			int x = 0;
			boolean found = false;

			while(!found){				
				if(x%n == 0 && finalDigits(x,n)  == n && sumOfDigits(x) == n){
					found = true;
					return x;
				}
				x += 1;
			}
		}
		return 0;
	}

	public static void printAllSpecialMult(int n){ // part 2
		for(int x = 1; x <= n; x++){
			System.out.println(x+"\t"+specialMult(x));
		}
	}


/*_________________________________________________________

						Question 2
___________________________________________________________*/

	public static void printWithComma(int n, int d){
		String result = "";
		String stringn = ""+n;
		int howmanydigits = howManyDigits(n);

		// if the input is n = -1 or n = 0 or d = -1 or d = 0 or the number of digits in (n)
		// is less or the same as d then return the number itself
		if(n <= 0 || d <= 0 || howmanydigits == 1 || howmanydigits <= d){
			System.out.println(n);
		}
		// if that wasnt the case then we want to add a comma only if we are not at the end of the number
		// i != howmanydigits, and at a specific place coresponding to d
		// exp: printWithComma(12345678, 3), we want to add a comma whevever we are in the 2 number
		// which is 2 or 5th number which is 5
		// we dont want to add a comma in the 8th number because i(8) = howmanydigits(8)
		// so to get the 2,5 we need to do some math,
		// the math that we are doing here is (howmanydigits - i)%d == 0 and we are not at the end of the number
		// -i- means where are we right now      	(howmanydigits - i)%d
		// lets take the 2nd number for example       (8 - 2)%3 = 6%3 = 0  and thats where we want to add the comma
		//                                          (howmanydigits - i)%d
		// lets take the 3rd number for example   	(8 - 3)%3 = 5%3 != 0 then we dont add a comma
		else{
			for(int i = 1; i < howmanydigits+1; i++){
				
				// moving the number to the result one digit by one digit
				result += stringn.charAt(i-1); 
				// checking if we are in the right place to add a comma
				result += (((howmanydigits-i)%d == 0) && i != howmanydigits) ? "," : ""; // if not we add ""
				// 																			which is basically nothing
			}
		}
		System.out.println(result); // printing the result
	}
}

