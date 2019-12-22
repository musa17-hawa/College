public class Array{
	private int[] numbers;

	public Array(int[] array){ // constructor that takes an array as an input and makes an Array object from it
		if (array == null){ // if the array in which was given is null then i make an empty arrary to intiat it,
			this.numbers = new int[0];
		}
		else{// if the array != null then we start puting the numbers in array into this.numbers one by one
			this.numbers = new int[array.length];
			for(int i = 0; i < array.length; i++){
				this.numbers[i] = array[i];
			}
		}
	}
		
//_________________________________________________

	public boolean isPrefix(Array other){
		if(this.numbers.length < other.numbers.length){ // there is no way all of (this.numbers) are inside other.numbers
			return false;
		}
		else if(other.numbers.length == 0){ // other is an empty list
			return true;
		}

		for(int i = 0; i < other.numbers.length; i++){ // if we found at least one elemnt in this.numbers that isnt 
			// in other.numbers then its not a prefix, so return false
			if(this.numbers[i] != other.numbers[i]){
				return false;
			}
		}
		return true; // if non of the above, then it is indeed a prefix
	}
//_________________________________________________

	public boolean isSuffix(Array other){
		if(this.numbers.length < other.numbers.length){ // 
			return false;
		}
		else if(other.numbers.length == 0){ // an empty array is always a suffix
			return true;
		}

		int j = other.numbers.length-1; // getting the last indix of the array other
		for(int i = this.numbers.length - 1; j >= 0; i--){// starting from the last elemnt in array
			if(this.numbers[i] != other.numbers[j]){// if we at least find one element in this.numbers != other.numbers
													// then its diffently not a suffix
				return false;
			}
		j--; // decrement
		}
		return true;
	}

//_________________________________________________

	public Array longestCommonPrefix(Array other){
		// taking the shortest length of both of the array, because the maximum length of the prefix
		// is the shortest of them
		int maxlength = (int)(Math.min(this.numbers.length, other.numbers.length));
		if (maxlength == 0){// if one of them is {} then this is the prefix 
			return new Array(null);
		}

		int counter = 0;
		while(counter < maxlength && (this.numbers[counter] == other.numbers[counter])){
			counter++; // counting how many elements are the same from the begining of each of the arrays
		}

		int[] result = new int[counter]; // making a new result int[] and the length of it is the counter
		// meaning how many elemnts we have in commen
		for(int i = 0; i < counter; i++){
			result[i] = this.numbers[i]; // puting the elements into the result[]
		}

		return new Array(result); // return a new array object of the (result[])
	}
//_________________________________________________

	public Array longestCommonSuffix(Array other){

		int thislength = this.numbers.length; // the length of this.numbers
		int otherlength = other.numbers.length; // the length of other.numbers
		int maxlength = (int)(Math.min(thislength, otherlength));// the minmum of them

		if (maxlength == 0){ // if one of them is {} then its definily the suffix
			return new Array(null);// returning {}
		}

		int counter = 0;		/*starting from the last elemnt of both the arrays and checking if they are equal*/
		while(counter < maxlength && this.numbers[(thislength-1) - counter] == other.numbers[(otherlength-1) - counter]){
			counter++; // if they are equal then we add 1 to counter
		}

		int[] result = new int[counter];// result[] with the length of how many common elements there are(from the end)
		for (int i = 0; i < counter; i++){
			result[i] = this.numbers[(thislength-(counter-i))];
			/*
			{1,2,5,6} this
			{3,4,1,5,6} other
			maxlength = 4
			counter = 2
			result[2]
			this.numbers = {1,2,5,6}
			result = {this.numbers[4-(2-0)], this.numbers[4-(2-1)]}
			result = {this.numbers[4-(2)], this.numbers[4-(1)]}
			result = {this.numbers[2], this.numbers[3]}
			result = {5,6}

			*/
		}

		return new Array(result);// return a new Array object of the array result
	}

	public int longestPrefixAndSuffix(){

		int i = 0;// starting at the first element
		int j = 1;// starting at the second element
		while(j < this.numbers.length && i < this.numbers.length){ // to avoid index out of bound
			if(this.numbers[i] != this.numbers[j]){ // if they are not equal, then we add 1 to j and reset i
				i = 0;
				if(this.numbers[i] != this.numbers[j]){
					j++;
				}
			}
			else{// if they are equal then we add 1 to both j and i and check again
				i++;
				j++;
			}
		}
		return i; // we return how much i is because thats the longest prefix and suffix length
	}

	public Array uniteWith(Array other){
		int resultlength = this.numbers.length + other.numbers.length; // the length of the new array is 
		// the sum length of both arrays(this. and other.)
		int[] result = new int[resultlength]; // initiating the result array

		for(int i = 0; i < this.numbers.length; i++){ // adding all of this. elements to result
			result[i] = this.numbers[i];
		}
		for(int i = 0; i < other.numbers.length; i++){ // add all of other. elemts to the result,
			// considering the **Offset** 
			result[i+this.numbers.length] = other.numbers[i];
		}

		return new Array(result); // return the Array object of result
	}






//	input(this. = {1,1,2,2} and other. = {1,2})
//	ouput({}) empty array
	// when removing other. from this. you get{1,2}
	// when done again you get {1,2}
	public void removeSub(Array other){ // removing sub array from this array
		if(other.numbers.length > this.numbers.length){ // if the sub(other.) is bigger in length than this.
			// then we cant make the remove
			System.out.println(" you cant remove " + other.toString() + " form " + this.toString());
			return;
		}
		while(this.whereIsSub(other) != -1){ //whereIsSub(Array) return the index of the start of the
		// first sub array in this. and if there isnt any subs then it return -1

			int[] result = new int[this.numbers.length-other.numbers.length]; // a new result int array
			// in the length of the difference of the lengths of both the arrays
			for(int j = 0, m = 0; j < result.length; j++){
				if(j == this.whereIsSub(other)){ // if we are in the index where the sub starts,
					// then we dont wanna add it to the result array
					result[j] = this.numbers[j+other.numbers.length]; // so we add  the elemnt which is right after
					// the sub finishes(j*index of result* + the length of the sub)
					m+= other.numbers.length; // if we enterd the sub then thats the offeset
				}
				else{
					result[j] = this.numbers[j+m];// if we enterd the sub then we have to add the offset
					// if we didnt enter the sub then we dont add the offest *m = 0*
				}
				
			}
			this.numbers = new int[result.length]; // reseting this.numbers array
			for(int i = 0; i < this.numbers.length; i++)//we add all of the elemnts in result to this.numbers
				this.numbers[i] = result[i];
		}// we check if there is sub again, then we the loop if there is, else , we dont
		System.out.println(this.toString());// we print the result
	}


	public int whereIsSub(Array other){// method that returns the index of the first sub found in this.numbers
		int i = 0;
		int k = 0;
		while(i < this.numbers.length && k < other.numbers.length){
			if(this.numbers[i] == other.numbers[k]){
				if(k == other.numbers.length-1){
					return i-k;
				}
				k++;
				i++;
			}
			else{
				k = 0;
				if(this.numbers[i] == other.numbers[k]){
					continue;
				}
				else{
					i++;
				}

			}
		}
		return -1;
	}


	public String toString(){ // Printing the details of the Array object
		if(this.numbers == null){
			return "Array has not been created";
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