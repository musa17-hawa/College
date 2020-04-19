import java.util.Arrays;
public class Tester{
	public static void main(String[] args) {
		BubbleSorter a = new BubbleSorter();
		InsertionSorter b = new InsertionSorter();
		MergeSorter c = new MergeSorter();
		int[] test = {1,4,2,3,5,7,6,10,9,8};
		boolean verbose = true;
		boolean verbose1 = false;
		//System.out.println(Arrays.toString(a.sort(test, verbose)));
		System.out.println(Arrays.toString(c.sort(test, verbose)));
	}
}