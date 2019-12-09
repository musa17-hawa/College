public class Array{
	private int[] numbers;

	public Array(int[] array){
		if (array == null){
			this.numbers = new int[0];
		}
		else{
			this.numbers = new int[array.length];
			for(int i = 0; i < array.length; i++){
				this.numbers[i] = array[i];
			}
		}
	}
//_________________________________________________

	public boolean isPrefix(Array other){
		if(this.numbers.length < other.numbers.length){
			return false;
		}
		else if(other.numbers.length == 0){
			return true;
		}

		for(int i = 0; i < other.numbers.length; i++){
			if(this.numbers[i] != other.numbers[i]){
				return false;
			}
		}
		return true;
	}
//_________________________________________________

	public boolean isSuffix(Array other){
		if(this.numbers.length < other.numbers.length){
			return false;
		}
		else if(other.numbers.length == 0){
			return true;
		}

		int j = other.numbers.length-1;
		for(int i = this.numbers.length - 1; j >= 0; i--){
			if(this.numbers[i] != other.numbers[j]){
				return false;
			}
		j--;
		}
		return true;
	}

//_________________________________________________

	public Array longestCommonPrefix(Array other){

		int maxlength = (int)(Math.min(this.numbers.length, other.numbers.length));
		if (maxlength == 0){
			return new Array(null);
		}

		int counter = 0;
		while(counter < maxlength && (this.numbers[counter] == other.numbers[counter])){
			counter++;
		}

		int[] result = new int[counter];
		for(int i = 0; i < counter; i++){
			result[i] = this.numbers[i];
		}

		return new Array(result);
	}
//_________________________________________________

	public Array longestCommonSuffix(Array other){

		int thislength = this.numbers.length;
		int otherlength = other.numbers.length;
		int maxlength = (int)(Math.min(thislength, otherlength));

		if (maxlength == 0){
			return new Array(null);
		}

		int counter = 0;
		while(counter < maxlength && this.numbers[(thislength-1) - counter] == other.numbers[(otherlength-1) - counter]){
			counter++;
		}

		int[] result = new int[counter];
		for (int i = 0; i < counter; i++){
			result[i] = this.numbers[(thislength-(counter-i))];
		}

		return new Array(result);
	}

	public int longestPrefixAndSuffix(){
		return 0; // placeholder
	}

	public Array uniteWith(Array other){
		return new Array(this.numbers); // placeholder
	}

	public void removeSub(Array other){

	}

	public String toString(){ // working fine
		if(this.numbers == null){
			return "there is no such object";
		}

		String result = "{";
		for(int i = 0; i < this.numbers.length; i++){
			result +=this.numbers[i];
			result += (i < this.numbers.length - 1) ? ", " : "";
		}
		result += "}";
		return result;
	}

}