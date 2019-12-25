public class Tester{
	public static void main(String[] args) {
		int[] a = {1,1,2,2}; //{1,2}
		int[] b = {1,2};//{1,2,1,2} //{2,3,4,1,3,5,5} ==> {2,3,4,3,5,5,5}
		//        {4,1,2,3} ==> {4,3}
		//							 {}
		//this.numbers[i-counter]
		Array array = new Array(a);	
		Array array1 = new Array(b);

		System.out.println("array "+array);
		System.out.println("array1 "+array1);
		System.out.println("is array1 a prefix of array ? : " + array.isPrefix(array1));
		System.out.println("is array1 a suffix of array ? : " + array.isSuffix(array1));
		System.out.println("what is the longestCommonPrefix ? : " + array.longestCommonPrefix(array1));
		System.out.println("what is the longestCommonSuffix ? : " + array.longestCommonSuffix(array1));
		System.out.println("what is the length of the longestPrefixAndSuffix of " +array+ " ? : " + array.longestPrefixAndSuffix());
		System.out.println(array + " + " + array1 + " ==> "+array.uniteWith(array1));
		System.out.print(array + " - " + array1 + " ==> ");array.removeSub(array1); // return {3}

	}
}

{1,1,2,2} ==> {1,2} ==> {}