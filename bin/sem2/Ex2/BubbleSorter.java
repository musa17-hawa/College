import java.util.Arrays;
public class BubbleSorter extends ArraySorter{
	public int[] sort(int[] a, boolean verbose){
		int [] b = new int[a.length];
		for(int i = 0; i < a.length; i++){
			b[i] = a[i];
		}
		return bubbleSort(b, b.length, verbose);
	}
private int[] bubbleSort(int[] array, int n, boolean verbose){
		int i;
		int j;
		int temp;
		boolean flip;
		for (i = 0; i < n - 1; i++){
			flip = false;
			for (j = 0; j < n - i - 1; j++){
				if (array[j] > array[j + 1]){
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					flip = true;
				}
				if (verbose == true){
					System.out.println(Arrays.toString(array));
				}
			}
			if (flip == false)
				return array;
		}
	return null;
	}
}