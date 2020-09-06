/*
 * Task. S.4.0
 * Fill in an array. 
 * Display the 0th, 14th and 27th elements of the array.
 */


public class PrintElementsArray {

	public static void main(String[] args) {
		final int[] x = new int[28];
		int a = 7;
		for (int i = 0; i<x.length; i++) {
			x[i] = a*365;
			a++;
		}
		
		System.out.println(x[0]);
        System.out.println(x[14]);
        System.out.println(x[27]);

	}

}
