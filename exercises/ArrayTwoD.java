public class ArrayTwoD{
	public static void main(String[] args) {
		System.out.println(notExist("abs", 'c'));
		int[][] a = {{0,0,0},{1,2,1},{2,2,2}};
		System.out.println(sumRow(a,1));
		System.out.println(sumCol(a,1));
		System.out.println("removeNonLetters from a$Bf#c ==> "+removeNonLetters("a$Bf#c"));
		System.out.println("number of 'a' in 'aaa' is ==> "+numOfOcc("aaa",'a'));
	}


	public static boolean notExist(String s, char c1){
			return s.indexOf(c1) == -1;
	}


	public static int sumRow(int[][] a,int row){
		int result = 0;
		for(int i = 0; i < a[row].length; i++){
			result += a[row][i];
		}
		return result;
	}

	public static int sumCol(int[][] a,int col){
		int result = 0;
		for(int i = 0; i < a.length; i++){
			result += a[i][col];
		}
		return result;
	}

	public static String removeNonLetters(String s){
		String result = "";
		for(int i = 0; i < s.length(); i++){
			int ascii = (int)(s.charAt(i));
			result += ((ascii >= 65 && ascii <=90) || (ascii >= 97 && ascii <= 122)) ? s.charAt(i) : "";

		}
		return result;

	}

	public static int numOfOcc(String s1, char c){
		int counter = 0;
		for(int i = 0; i < s1.length(); i++){
			counter += (c == s1.charAt(i)) ? 1 : 0;
		}
		return counter;
		
	}

}