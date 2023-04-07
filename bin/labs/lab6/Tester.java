public class Tester{
	public static void main(String[] args) {
		int a[][] = {{1,1,1},{0,1,1},{0,0,1}};
		TwoDArray first = new TwoDArray(a);
		System.out.println(first.isUpperTriangular());
	}
}