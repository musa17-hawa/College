public class Ex7{

	public static void main(String[] args) {
		int[][] temp = {{-4,-1,1,2},{4,5,7,8},{11,12,15,17},{20,30,35,54}};
		int[][] test = {{1,2,3},{4,5,6},{7,8,9}};
		int[] temp1 = {-3,10,0,9,2,5,3,0,6,-5};//9,5,10


		int[][] big = new int[100][100];
		int l = 1;
		for(int i = 0; i < 100; i++){
			for(int j = 0; j < 100; j++){
				big[i][j] = l;
				l++;
			}
		}

		System.out.println(find(big, 10000));
		for(int j = 0; j < 11; j++){
			System.out.println(""+j +" "+ find1(temp1,j));

		}
		System.out.println(countSub("abaaabaabb", 'a', 'b'));


	}


/*

**veeeryyy impoooortannnttt**
index = 8
a[index/length][index%length]

*/


	public static boolean find(int[][] a, int x){ // O(n^2) ==> nlog(n)
		return false;

	}

	public static int find1(int[] a, int x){ // O(2log(n))
		int lastOddInd = ((a.length-1)%2 == 0) ? a.length-2 : a.length-1;
		int lastEvenInd = ((a.length-1)%2 == 0) ? a.length-1 : a.length-2;
		if((x < a[0] && x < lastOddInd) || (x > a[1] && x > lastEvenInd)) return -1;

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
		int indexOfFirst = s.indexOf(first);
		for(int i = (s.length() - 1); i > indexOfFirst; i--){
			if (s.charAt(i) == last) return (i - indexOfFirst)+1;
		}
		return -1;

	}
}
