public class Loop{
	public static void main(String[] args) {
		int ans1 = countDigits(11111);
		System.out.println("countDigits of 11111: "+ans1);

		int ans2 = powNum(2,4);
		System.out.println("powNum of 2,4: "+ans2);

		int ans3 = maxDigit(148);
		System.out.println("maxDigit of 148: "+ans3);
	}
		public static int countDigits(int n){
			int counter = 0;
			while (n > 0){
				n/=10;
				counter+=1;
			}
			return counter;
		}
			
	
		public static int powNum(int x, int y){
			int sum = 1;
			while (y>0){
				sum *= x;
				y -= 1;
			}
			return sum;
		}

		
		public static int maxDigit(int n){
			int digit;
			int max = 0;
			while (n > 0){
				digit = n%10;{
				max = (digit > max) ? digit : max;
				}
				n/=10;
			}
			return max;
	}
}