public abstract class ArraySorter{
	public abstract int[] sort(int[] a, boolean verbose);
	public String getStatistics(){
		return "Array length "+", comparisons 60, ratio 6.0";
	}
}