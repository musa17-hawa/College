public class MyArray{
	private int[] numbers;

	public MyArray(int n){
		this.numbers = new int[n];
		for(int i = 0; i < n; i++){
			this.numbers[i] = (int)(Math.random()*100);
		}
	}
	public MyArray(int[] other){
		this.numbers = new int[other.length];
		for(int i = 0; i < other.length; i++){
			this.numbers[i] = other[i];
		}
	}

	public String toString(){
		String result = "{";
		for(int i = 0; i < this.numbers.length; i++){
			result +=this.numbers[i];
			result += (i < this.numbers.length - 1) ? ", " : "";
		}
		result += "}";
		return result;
	}

	public int findMaxNum(){
		int max = 0;
		for(int i = 0; i < this.numbers.length; i++){
			max = (this.numbers[i] > max) ? this.numbers[i] : max;
		}
		return max;
	}

	public boolean hasSubArray(int[] other){
	// 	for(int i = 0; i <=(this.numbers.length - other.length); i++){
	// 		for(int k = 0; k < other.length && this.numbers[i + k] == other[k]; k++){
	// 			if(k+1 >= other.length){
	// 				return true;
	// 			}
	// 		}
	// 	}
	// return false;
	// }

		int i = 0;
		int k = 0;
		while(i < this.numbers.length && k < other.length){
			if(this.numbers[i] == other[k]){
				i++;
				k++;
				if(k == other.length){
					return true;
				}
			}
			else{
				i++;
				k = 0;
			}
		}
		return false;
	}
}