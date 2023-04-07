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
		System.out.println(countSub("aaaa", 'a', 'b'));

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
		// starting at the up right element
		int row = 0;
		int col = a.length-1;
		// if reached the down left element then we stop
		while(row < a.length && col >= 0){
			// if x is less than this specific element then we decrement the col
			if(x < a[row][col]){
				col--;
			}
			// if x is bigger than this specific elemnt then we increment the row
			else if(x > a[row][col]){
				row++;
			}
			// if it is equal then we return true
			else if(x == a[row][col]){
				return true;
			}
		}
		return false;
	}
	public static int find(int[] a, int x){ // O(log(n))
		// defining the index of the last odd element and the last even element
		int lastOddInd = ((a.length-1)%2 == 0) ? a.length-2 : a.length-1;
		int lastEvenInd = ((a.length-1)%2 == 0) ? a.length-1 : a.length-2;
		// if x is less than the smallest even and odd elements
		// if x is more than the largest even and odd elements
		// we return -1 meaning there isnt x in a
		if((x < a[0] && x < a[lastOddInd]) || (x > a[1] && x > a[lastEvenInd])) return -1;
		// starting with even
		int start = 0;
		int end = lastEvenInd;
		// binary search
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
		// if we dont find it in the even then
		// we start with the odd elemnts 
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
		// if we didnt find it in either the odd or the even then its not there
		return -1;
	}
	public static int countSub(String s, char first, char last){// O(n)
		// starting with sum = 0
		int sum = 0;
		int sumOfFirst = 0; // how many first's so far
		for(int i = 0; i < s.length(); i++){ // stopping condition
			if(s.charAt(i) == last){// if we find 'last' we add how many first's to sum
				sum += sumOfFirst;
			}
			
			if(s.charAt(i) == first){ // if we find first then we add 1 to the sumOfFirst
				sumOfFirst++;
			}
			else{
				continue;
			}
		}
		return sum;
	}
}
