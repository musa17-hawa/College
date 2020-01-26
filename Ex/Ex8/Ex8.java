import java.util.Arrays;
public class Ex8{
//_________________________________________
//_________________________________________

	public static int howManyEven(int num){// working fine
		//checking for the next step along with the even digit, just because if its 0,
		//i included 0 even though it was not requird
		int digit = num%10 ;
		if (digit%2==0 && num/10 != 0 ) return 1+howManyEven(num/10) ; 
		else if (digit%2==0 && num/10==0 )	return 1 ; 
		else if (digit%2!=0 && num/10==0 )	return 0 ; 
		else if (digit%2!=0 && num/10 != 0 ) return  howManyEven(num/10) ; 
		return 0;	
	}

	public int longestAscending(int[] a){// working fine, need to check for {0,0,0,0}, and {5,4,3,2,1} if its ok to return 1
		return lengthOfLongest(a,0,1);
	}


	public int[] merge(int[] a, int[] b){
		int[] result = new int[a.length + b.length];
		return mergeWithIndex(a, b,result,0,0,0);
	}

	public boolean equalIgnoreCase(String s1, String s2){// working fine
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
	 	int[] temp = {Integer.MAX_VALUE};// largest integer value in java in an array
		//{-1,0,5,7,9,11,12}
		//{1,3,16,18,100,101}
		if(k < result.length){//stoping condition
			if(i == a.length){// it means we are done with array a
				result[k] = b[j];
				return mergeWithIndex(temp,b,result,0,j+1,k+1);// we return the temp[0] array and continue with b[+1]
			}
			else if(j == b.length){// we are done with b
				result[k] = a[i];
				return mergeWithIndex(a,temp,result,i+1,0,k+1);// returning a[+1] and temp[0]
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