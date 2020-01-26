import java.util.*;


public class Ex8_Tester {

	public static void main(String[] args) 
	{
		
//		// question 1:
		System.out.println();
		System.out.println("***** howManyEven");
		System.out.println();
		Ex8 e = new Ex8();
		System.out.print(e.howManyEven(17225138)+ "\t"); 
		System.out.println("should be => 3");
		System.out.print(e.howManyEven(85102)+ "\t"); 
		System.out.println("should be => 3");
		System.out.print(e.howManyEven(0)+ "\t"); 
		System.out.println("should be => 1");
		System.out.print(e.howManyEven(100)+ "\t"); 
		System.out.println("should be => 2");
		System.out.print(e.howManyEven(4)+ "\t"); 
		System.out.println("should be => 1");
		System.out.print(e.howManyEven(1791153151)+ "\t"); 
		System.out.println("should be => 0");
		System.out.print(e.howManyEven(482546008)+ "\t"); 
		System.out.println("should be => 8");

//		 question 2:
		System.out.println();
		System.out.println("***** longestAscending");
		System.out.println();
		int a[] = {4,2,7,10,5,0,9,15,14,12};
		int a1[] = {4,2,6,0,7,1,4,1,4,8,9,10};
		int a2[] = {};
		int a3[] = {4};
		int a4[] = {1,1,1,1,1,1,1,1,1,1};
		int a5[] = {10,9,8,7,6,5,4,3,2,1};
		System.out.print(e.longestAscending(a)+ "\t"); 
		System.out.println("should be => 4");
		System.out.print(e.longestAscending(a1)+ "\t"); 
		System.out.println("should be => 6");
		System.out.print(e.longestAscending(a2)+ "\t"); 
		System.out.println("should be => 0");
		System.out.print(e.longestAscending(a3)+ "\t"); 
		System.out.println("should be => 1");
		System.out.print(e.longestAscending(a4)+ "\t"); 
		System.out.println("should be => 1");
		System.out.print(e.longestAscending(a5)+ "\t"); 
		System.out.println("should be => 1");
		
		// question 3:
		System.out.println();
		System.out.println("***** merge");
		System.out.println();
		int b[] = {0};
		int b11[] = {1,3,4,7,10};
		int b12[] = {2,3,4,5,11,12};
		int b21[] = {2, 5 , 8, 99 , 451};
		int b22[] = {1, 2, 6, 10, 11};
		int b31[] = {1,2,3};
		int b32[] = {1,2};
		int b41[] = {1,2};
		int b42[] = {1,2,3};
		int b51[] = {1,3,5,7,9};
		int b52[] = {2,4,6,8,10};
		int b61[] = {};
		int b62[] = {};
		int b71[] = {4,8,9,12,51,89,95,99,111,10000};
		int b72[] = {8,8,8,8,8,8};
		System.out.print(print(e.merge(b11, b12))+ "\t"); 
		System.out.println("should be => "+ added(b11,b12));
		System.out.print(print(e.merge(b21, b22))+ "\t"); 
		System.out.println("should be => "+ added(b21,b22));
		System.out.print(print(e.merge(b31, b32))+ "\t"); 
		System.out.println("should be => "+added(b31,b32));
		System.out.print(print(e.merge(b41, b42))+ "\t"); 
		System.out.println("should be => "+ added(b41,b42));
		System.out.print(print(e.merge(b51, b52))+ "\t"); 
		System.out.println("should be => "+ added(b51, b52));
		System.out.print(print(e.merge(b61, b62))+ "\t"); 
		System.out.println("should be => "+ added(b61,b62));
		System.out.print(print(e.merge(b61, b12))+ "\t"); 
		System.out.println("should be => "+ added(b61,b12));
		System.out.print(print(e.merge(b, b12))+ "\t"); 
		System.out.println("should be => "+ added(b,b12));
		System.out.print(print(e.merge(b52, b62))+ "\t"); 
		System.out.println("should be => "+ added(b52,b62));
		System.out.print(print(e.merge(b71, b72))+ "\t"); 
		System.out.println("should be => "+ added(b71,b72));
		System.out.print(print(e.merge(b71, b72))+ "\t"); 
		System.out.println("should be => "+ added(b72,b71));
		
				
		// question 4:
		System.out.println();
		System.out.println("***** equalIgnoreCase");
		System.out.println();
		String s = "aBcD";
		String s1 = "AbCd";
		String s2 = "";
		String s3 = "ab*#";
		String s4 = "Ab*#";
		String s5 = "abcE";
		String s6 = "abcD";
		String s7 = "                           ";
		String s8 = "!@#$%^^&*&^**&(!!!@#VHVCXVswergdqdqdvxv#@5613218513246513518";
		String s9 = "!@#$%^^&*&^**&(!!!@#VHVCXVswergdqdqdvxv#@56132185132465103518";


		System.out.printf("%s, %s, \t%b\t", s, s1, e.equalIgnoreCase(s, s1) );
		System.out.println("should be => true");
		System.out.printf("%s\t, %s\t, \t%b\t", s2, s2, e.equalIgnoreCase(s2, s2) );
		System.out.println("should be => true");
		System.out.printf("%s, %s, \t%b\t", s3, s4, e.equalIgnoreCase(s3, s4) );
		System.out.println("should be => true");
		System.out.printf("%s, %s, \t%b\t", s5, s6, e.equalIgnoreCase(s5, s6) );
		System.out.println("should be => false");
		System.out.printf("%s, %s, \t%b\t", s, s2, e.equalIgnoreCase(s3, s2) );
		System.out.println("should be => false");
		System.out.printf("%s, %s, \t%b\t", s4, s3, e.equalIgnoreCase(s4, s3) );
		System.out.println("should be => true");
		System.out.printf("%s, %s, \t%b\t", s7, s2, e.equalIgnoreCase(s7, s2) );
		System.out.println("should be => false");
		System.out.printf("%s, %s, \t%b\t", s8, s8, e.equalIgnoreCase(s8, s8) );
		System.out.println("should be => true");
		System.out.printf("%s, %s, \t%b\t", s8, s8.toLowerCase(), e.equalIgnoreCase(s8, s8.toLowerCase()) );
		System.out.println("should be => true");
		System.out.printf("%s, %s, \t%b\t", s8.toLowerCase(), s8, e.equalIgnoreCase(s8.toLowerCase(), s8));
		System.out.println("should be => true");
		System.out.printf("%s, %s, \t%b\t", s8, s9.toLowerCase(), e.equalIgnoreCase(s8, s9.toLowerCase()) );
		System.out.println("should be => false");
		
		
	}
	
	public static String added(int a[], int b[]) 
	{
		String res = "{";
		int bothLength = a.length + b.length;
		int both[] = new int [bothLength];
		if (both.length >0) 
		{
			for(int i = 0, j = 0; i<both.length; i++) 
			{
				if(i< a.length)
					both[i] = a[i];	
				else
				{
					both[i] = b[j];	
					j++;
				}
			}
			Arrays.sort(both);
			for (int i = 0; i < both.length - 1; i++) 
			{
				res += both[i] + ", ";
			}
			res += both[both.length - 1];
		}
		res += "}";
		return res;
	}
	
	public static String print(int []a) 
	{

			
			String res = "{";
			if (a.length >0) 
			{
				for (int i = 0; i < a.length - 1; i++) 
				{
					res += a[i] + ", ";
				}
				res += a[a.length - 1];
			}
			res += "}";
			return res;
		
	}

}


