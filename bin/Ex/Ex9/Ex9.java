public class Ex9{
	public static void main(String[] args) {
		printAllBinary(4);
	}

	public static void printAllBinary(int n){// 2 ==> 00,01,10,11
		int[] result =  new int[n];
		generateAllBinaryStrings(result.length, result, 0);
		
	}

	public static void printSubs(String s){

	}

// Function to generate all binary strings 
	public static void generateAllBinaryStrings(int n, int result[], int i) { 
	    if (i == n){ 
	        printTheArrayWithIndex(result,0); 
	        return; 
	    } 
	 
	    result[i] = 0; 
	    generateAllBinaryStrings(n, result, i + 1);

	    result[i] = 1; 
	    generateAllBinaryStrings(n, result, i + 1); 
	}

	public static void printTheArray(int[] result, int n){ 
	    System.out.println(); 
	}

	public static void printTheArrayWithIndex(int[] result, int i){
		if(i == result.length){
			System.out.println();
			return;
		}
		else{
			System.out.print(result[i]);
			printTheArrayWithIndex(result, i+1);	
		}
	}
}