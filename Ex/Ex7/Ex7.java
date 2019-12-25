public class Ex7{

	public static void main(String[] args) {
		int[][] temp = {{-4,-1,1,2},{4,5,7,8},{11,12,15,17},{20,30,35,54}};
		int[][] test = {{1,2,3},{4,5,6},{7,8,9}};
		int[] temp1 = {1,9,2,8,3,7,4,6};
		int[][] big = new int[100][100];
		int l = 1;
		for(int i = 0; i < 100; i++){
			for(int j = 0; j < 100; j++){
				big[i][j] = l;
				l++;
			}
		}

		System.out.println(find(big, 10000));
		System.out.println(find1(temp1, 3));
		

	}


/*

**veeeryyy impoooortannnttt**
index = 8
a[index/length][index%length]

*/


	public static boolean find(int[][] a, int x){ // O(log(n))
		int start = 0;
		int end = (a.length*a.length)-1;

		while(start <= end){
			int mid = (end +  start)/2;
			if(a[mid/a.length][mid%a.length] > x){
				end = mid - 1;
			}
			else if(a[mid/a.length][mid%a.length] < x){
				start = mid + 1;
			}
			else if(a[mid/a.length][mid%a.length] == x){
				return true;
			}
		}

		return false;

	}
// if a.length is even the mid is odd and vice versa
	public static int find1(int[] a, int x){
		int start = 0;
		int end = a.length-1;


		while(start <= end){
			int mid = (end +  start)/2;
			System.out.println(mid+"\t"+a[mid]);
			
		return -1;
	}

	public static int countSub(String s, char first, char last){
		return -1;

	}
}
