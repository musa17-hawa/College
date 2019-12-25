public class Tester{


	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		int x = 0;
		System.out.println(isThere(a,x));
	}



	public static boolean isThere(int[] a, int x){
		int start = 0;
		int end = a.length-1;

		while(start <= end){
			int mid = (end +  start)/2;
			if(a[mid] > x){
				end = mid - 1;
			}
			else if(a[mid] < x){
				start = mid + 1;
			}
			else if(a[mid] == x){
				return true;
			}
		}
		return false;
	}




}