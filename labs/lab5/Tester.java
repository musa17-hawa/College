public class Tester{
	public static void main(String[] args) {
		MyArray array = new MyArray(5);

		int[] a = {1,2,3,1,2,4};
		int[] b = {2,4};

		MyArray arraya = new MyArray(a);
		MyArray arrayb = new MyArray(b);


		System.out.println(array);
		System.out.println("max is "+array.findMaxNum());
		System.out.println(arraya);
		System.out.println(arrayb);
		System.out.println(arraya.hasSubArray(b));

	}
}