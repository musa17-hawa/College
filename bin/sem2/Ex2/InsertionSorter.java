import java.util.Arrays;
public class InsertionSorter extends ArraySorter{
	public int[] sort(int[] a, boolean verbose){
		int [] b = new int[a.length];
		for(int i = 0; i < a.length; i++){
			b[i] = a[i];
		}
		return insertionSort(b, verbose);
	}
    private int[] insertionSort(int arr[], boolean verbose){
        int n = arr.length; 
        for (int i = 1; i < n; ++i) { 
            int key = arr[i]; 
            int j = i - 1; 
            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            }
            if(verbose == true){
            	System.out.println(Arrays.toString(arr));
            }
            arr[j + 1] = key; 
        }
        return arr;
    }
}