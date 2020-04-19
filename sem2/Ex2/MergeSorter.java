import java.util.Arrays;

public class MergeSorter extends ArraySorter{
	public int[] sort(int[] a, boolean verbose){
		int [] b = new int[a.length];
		for(int i = 0; i < a.length; i++){
			b[i] = a[i];
		}
		return sortB(b, 0, b.length-1, verbose);
	}
	private void merge(int a[], int s, int m, int e, boolean verbose){
		int leftarrlength = m - s + 1;
		int rightarrlength = e - m;

		int leftarray[] = new int [leftarrlength];
		int rightarray[] = new int [rightarrlength];


		for (int i=0; i<leftarrlength; ++i)
			leftarray[i] = a[s + i];

		for (int j=0; j<rightarrlength; ++j)
			rightarray[j] = a[m + 1+ j];


		int i = 0, j = 0;
		int k = s;


		while (i < leftarrlength && j < rightarrlength){
			if (leftarray[i] <= rightarray[j]){
				a[k] = leftarray[i];
				i++;
				if (verbose == true){
					System.out.println(Arrays.toString(a));
				}
			}
			else{
				a[k] = rightarray[j];
				j++;
				if (verbose == true){
					System.out.println(Arrays.toString(a));
				}
			}
			k++;
		}
		while (i < leftarrlength){
			a[k] = leftarray[i];
			i++;
			k++;
			if (verbose == true){
				System.out.println(Arrays.toString(a));
			}
		}
		while (j < rightarrlength){
			a[k] = rightarray[j];
			j++;
			k++;
			if (verbose == true){
				System.out.println(Arrays.toString(a));
			}
		} 
	}
	private int[] sortB(int a[], int s, int e, boolean verbose){ 
		if (s < e){
			int m = (s+e)/2; 
			sortB(a, s, m, verbose); 
			sortB(a , m+1, e, verbose);  
			merge(a, s, m, e, verbose); 
		}
		return a;
	}
}