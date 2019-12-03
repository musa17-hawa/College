public class Loops{
	public static void main(String[] args) {
			printAllSpecialMult(37);
			System.out.println("\n");
			printWithComma(12345678, 1);
	}
/*_________________________________________________________

				needed methods Created by me
___________________________________________________________*/


	public static int howManyDigits(int n){
		int counter = 0;
		while(n > 0){
			n/=10;
			counter+=1;
		}
		return counter;
	}

	public static int sumOfDigits(int n){
		int sum = 0;
		while(n > 0){
			sum += n%10;
			n /= 10;
		}
		return sum;
	}

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

		if(n <= 0 || d <= 0 || howmanydigits == 1 || howmanydigits <= d){
			System.out.println(n);
		}
		else{
			for(int i = 1; i < howmanydigits+1; i++){
				result += stringn.charAt(i-1);
					result += (((howmanydigits-i)%d == 0) && i != howmanydigits) ? "," : "";
			}
		}
		System.out.println(result);
	}
}

