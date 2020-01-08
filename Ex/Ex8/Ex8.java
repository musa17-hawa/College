import java.util.Arrays;
public class Ex8{
	public static void main(String[] args) {

		int[] x = {-1,2,0,3};
		int[] b = {32,21,32,33};
		int[] test = {4,2,7,10,5,0,9,15,14,12};
		// int[] temp1 = {-1,0,5,7,9,11,12,200,201};
		// int[] temp2 = {1,3,16,18,100,101,300};
		String s1 = "hello$world2n!";
		String s2 = "HelLo$WoRLd2N!";

		// binary operator
		char bigh = 'h'&~32;// A ==> a __ A|32 = a
		char smallh = 'H'|32;// a ==> A __ a&~32 = A

		System.out.println(howManyEven(2220));
		System.out.println(longestAscending(test));
		System.out.println(Arrays.toString(temp1)+" + "+Arrays.toString(temp2)+" ==> "+Arrays.toString(merge(temp1,temp2)));
		System.out.println(equalIgnoreCase(s1,s2));
	}
//_________________________________________
//_________________________________________

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
		int[] result = new int[a.length + b.length];
		return mergeWithIndex(a, b,result,0,0,0);
	}

	public static boolean equalIgnoreCase(String s1, String s2){// working fine
		if(s1.length() == 0 && s2.length() == 0) return true;
		if(s1.length() != s2.length()) return false;
		if((s1.charAt(0) == s2.charAt(0)) || ((s1.charAt(0)|32) == (s2.charAt(0)|32))) return equalIgnoreCase(s1.substring(1,s1.length()),s2.substring(1,s2.length()));
		else return false;
	}
//+++++++++++++++++++++++++++++++++++++++++++++++++++
//+++++++++++++++++++++++++++++++++++++++++++++++++++
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
//___________________________________________________
//___________________________________________________

//+++++++++++++++++++++++++++++++++++++++++++++++++++
//+++++++++++++++++++++++++++++++++++++++++++++++++++
	public static int[] mergeWithIndex(int[] a, int[] b,int[] result, int i, int j, int k){// i is always 0, j is always 0
	 	int[] temp = {Integer.MAX_VALUE};
		//{-1,0,5,7,9,11,12}
		//{1,3,16,18,100,101}
		if(k < result.length){
			if(i == a.length){
				result[k] = b[j];
				return mergeWithIndex(temp,b,result,0,j+1,k+1);
			}
			else if(j == b.length){
				result[k] = a[i];
				return mergeWithIndex(a,temp,result,i+1,0,k+1);
			}
			else{
				if(a[i] < b[j]){
					result[k] = a[i];
					return mergeWithIndex(a,b,result,i+1,j,k+1);

				}
				if(b[j] < a[i]){
					result[k] = b[j];
					return mergeWithIndex(a,b,result,i,j+1,k+1);
				}
				else{
					result[k] = a[i];
					result[k+1] = b[j];
					return mergeWithIndex(a,b,result,i+1,j+1,k+2);
				}
			}
		}
		return result;
	}
//___________________________________________________
//___________________________________________________
} 