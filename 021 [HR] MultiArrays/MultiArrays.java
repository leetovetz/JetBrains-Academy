/*
 * Task. Introduce multidimensional array.
 */

public class MultiArrays {

	public static void twoDimentionalArrayDemo(int[][] iaa) {
		System.out.println("Array contains: ");
		for (int i = 0; i < iaa.length; i++) {
			System.out.print(iaa[i].length + " elements: ");
			for (int j = 0; j < iaa[i].length; j++) {
				System.out.print(" " + iaa[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] iaaOne = { { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4 }, { 1, 2, 3 }, { 1, 2 }, { 1 } };
		twoDimentionalArrayDemo(iaaOne);

	}
}
