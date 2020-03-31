import java.util.*;

public class Ex1{
	public static void main(String[] args) {
		int[] a = {1,1,1,0,0,1,0};
		int[] b = {0,1,0,1,1,1,0};
		System.out.println(findZero(b));
	}

	private static int whatIsMax(int[] a){
		int counter = 0;
		int max = 0;
		for(int i = 0; i < a.length; i++){
			if(a[i] == 1){
				counter++;
				if (counter > max){
					max = counter;
				}
			}
			if(a[i] == 0){
				counter = 0;
			}
		}
		return max;
	}


	public static int findZero(int[] a){//{1,1,1,0,0,1,0} ==> 3, {0,1,0,1,1,1,0} ==> 2
		int max = 0;
		int index = -1;

		for(int i = 0; i < a.length; i++){
			if(a[i] == 0){
				a[i] = 1;
				int	counter = whatIsMax(a);
				if(counter>max){
					max = counter;
					System.out.println("max is: "+max);
					index = i;
					a[i] = 0;
				}

			}

		}
		return index;
	}

}