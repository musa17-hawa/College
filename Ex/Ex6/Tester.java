public class Tester{
	public static void main(String[] args) {
		int[] a = {3,4,1,2,6};
		int[] b = {3,4,1,2,6};
		Array array = new Array(a);
		Array array1 = new Array(b);

		System.out.println("array "+array);
		System.out.println("array1 "+array1);
		System.out.println("is array1 a prefix of array ? : " + array.isPrefix(array1));
		System.out.println("is array1 a suffix of array ? : " + array.isSuffix(array1));
		System.out.println("what is the longestCommonPrefix ? : " + array.longestCommonPrefix(array1));
		System.out.println("what is the longestCommonSuffix ? : " + array.longestCommonSuffix(array1));

	}
}