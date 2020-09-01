/*
 Task

The code in your editor does the following:

1. Reads an integer from stdin and saves it to a variable,n , 
denoting some number of integers.
2. Reads n integers corresponding to a0 a1 ... a (n-1) 
from stdin and saves each integer a1 to a variable, val.
3. Attempts to print each element of an array of integers named a.

Write the following code in the unlocked portion of your editor:

1. Create an array,a , capable of holding n integers.
2. Modify the code in the loop so that it saves each 
sequential value to its corresponding location in the array. 
For example, the first value must be stored in a0, the second 
value must be stored in a1, and so on.
 */

import java.util.*;

public class Solution {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		
		for (int i = 0; i< a.length; i++) {
			a[i] = scan.nextInt();
		}
		
		scan.close();
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("a" + i + " = " + a[i]);
		}
		
	}

}
