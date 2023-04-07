public class Test{
	public static void main(String[] args) {
		System.out.println(sumOf(4));
		System.out.println(h(461));
		System.out.println(294+"\t"+g(294)+"\n");
		printNumbers(4);
		System.out.println("\n"+power(2,3)+"\n");
		reverse(1234);
		System.out.println("\n");
		drawTriangle(5);
		System.out.println("\n");

	}
	public static int sumOf(int n){
		if(n == 0) return n;
		else return n+sumOf(n-1);
	}

	public static int h(int n){
		if(n == 0) return 0;
		else return 1+h(n/10);
	}

	public static int g(int n){
		if(n < 10) return n;
		int x = n%10;
		int y = g(n/10);
		if(x>y) return x;
		else return y;
	}

	public static void printNumbers(int n){
		if(n < 0) return;
		System.out.println(n);
		printNumbers(n-1);
	}

	public static int power(int n, int m){//n*n*n*n ==> m times
		if(m ==1) return n;
		return n*power(n,m-1);
	}

	public static void reverse(int num){
		if(num/1 == 0) return;
		int digit = num%10 ;
		System.out.print(digit);
		reverse(num/10);
	}

	public static void personalMethod(int num){
		if(num == 0) return;
		System.out.print("*");
		personalMethod(num-1);
	}

	public static void drawTriangle(int num){
		if(num == 0) return;
		System.out.println("");
		personalMethod(num);
		drawTriangle(num-1);
	}

	public static int sumArray(int[] a){

	}


}