public class Lab9{
	public static void main(String[] args) {
		int[][] a = {{3,1,2},{6,4,5},{9,7,8}};
		for(int i = 1; i < 20; i++){
			System.out.println(find(a, i));

		}

	}

	public static boolean find(int[][] a, int x){
		int start = 0;
		int end = a.length-1;
		int mid = (end +  start)/2;
		while(start <= end){
			mid = (end +  start)/2;
			if(a[mid][0] > x){
				for(int i = 0; i < a[0].length; i++){
					if(a[mid][i] == x){
						return true;
					}
				}
				end = mid - 1;
			}
			else if(a[mid][0] < x){
				for(int i = 0; i < a[0].length; i++){
					if(a[mid][i] == x){
						return true;
					}
				}
				start = mid + 1;
			}
			else if(a[mid][0] == x){
				return true;
			}

		}
	return false;
	}	
}