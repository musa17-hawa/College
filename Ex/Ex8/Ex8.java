public class Ex8{
	public static void main(String[] args) {

		System.out.println(howManyEven(2220));
		int[] x = {-1,2,0,3};
		int[] b = {32,21,32,33};
		int[] test = {4,2,7,10,5,0,9,15,14,12};
		System.out.println(longestAscending(test));
		String s1 = "hello$world2n!";
		String s2 = "HelLo$WoRLd2N!";
		System.out.println(equalIgnoreCase(s1,s2));

	}

	public static int howManyEven(int num){// working fine
		
		int digit = num%10 ;
		if (digit%2==0 && num/10 != 0 ) return 1+howManyEven(num/10) ; 
		else if (digit%2==0 && num/10==0 )	return 1 ; 
		else if (digit%2!=0 && num/10==0 )	return 0 ; 
		else if (digit%2!=0 && num/10 != 0 ) return  howManyEven(num/10) ; 
		return 0;	
	}

	public static int longestAscending(int[] a){// working fine, need to check for {0,0,0,0}, and {5,4,3,2,1} if its ok to return 1
		return lengthOfLongest(a,0,1);
	}

	public static int[] merge(int[] a, int[] b){
		return a;
	}

	public static boolean equalIgnoreCase(String s1, String s2){// working fine
		if(s1.length() == 0 && s2.length() == 0) return true;
		if(s1.length() != s2.length()) return false;

		if((s1.charAt(0) == s2.charAt(0)) || ((s1.charAt(0)|32) == (s2.charAt(0)|32))) return equalIgnoreCase(s1.substring(1,s1.length()),s2.substring(1,s2.length()));
		else return false;
	}

	public static int lengthOfLongest(int[] a, int i,int j){//always we start with (i = 0, j = 1)
		if(a.length == 0) return 0;
		if(a.length == 1) return 1;

		if(i < a.length && j < a.length){
			if(a[i] > a[j]) return lengthOfLongest(a,i,j+1);
			else if(a[i] < a[j]) return 1+lengthOfLongest(a,j,j+1);
			else return lengthOfLongest(a,i,j+1);
		}
		return 1;
	}
} 