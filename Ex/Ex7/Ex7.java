public class Ex7{

	public static void main(String[] args) {
		int[][] temp = {{1,3,8,12},{2,5,9,13},{3,9,10,14},{4,10,11,15}};
		int[] temp1 = {-3,10,0,9,2,5,3,0,6,-5};

		/*

		1	3	8	(12)
		2	5	9	13
		3	9	10	14
		4	10	11	15

		*/

		System.out.println(find(temp,15));
		System.out.println(find(temp1,-5));
		System.out.println(countSub("abaaabaabb", 'a', 'a'));

	}


/*

**veeeryyy impoooortannnttt**
a = 3*3
index = 7
a[index/length][index%length]
a[row][col]
a[7/3][7%3]
a[2][2]

*/


	public static boolean find(int[][] a, int x){ // O(n^2) ==> O(n)
		int row = 0;
		int col = a.length-1;
		while(row < a.length && col >= 0){
			if(x < a[row][col]){
				col--;
			}
			else if(x > a[row][col]){
				row++;
			}
			else if(x == a[row][col]){
				return true;
			}
		}
		return false;
	}
	public static int find(int[] a, int x){ // O(log(n))
		int lastOddInd = ((a.length-1)%2 == 0) ? a.length-2 : a.length-1;
		int lastEvenInd = ((a.length-1)%2 == 0) ? a.length-1 : a.length-2;
		if((x < a[0] && x < a[lastOddInd]) || (x > a[1] && x > a[lastEvenInd])) return -1;

		int start = 0;
		int end = lastEvenInd;
		while(start < end){

			int mid = (end +  start)/2;

			mid += mid%2;
			if(a[mid] > x){
				end = mid - 1;
			}
			else if(a[mid] < x){
				start = mid + 1;
			}
			else if(a[mid] == x){
				return mid;
			}
		}


		start = 1;
		end = lastOddInd;
		while(start < end){
			int mid = (end +  start)/2;
			mid += (mid%2 == 0)? 1 : 0;
			if(a[mid] > x){
				start = mid + 1;
			}
			else if(a[mid] < x){
				end = mid - 1;
			}
			else if(a[mid] == x){
				return mid;
			}

		}
		return -1;
	}
	public static int countSub(String s, char first, char last){// O(n)
		int sum = 0;
		int sumOfA = 0;
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == last){
				sum += sumOfA;
			}
			
			if(s.charAt(i) == first){
				sumOfA++;
			}
			else{
				continue;
			}
		}
		return sum;
	}
}
