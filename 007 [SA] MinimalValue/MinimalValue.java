// The task. Find the minimum element in the array. 

public class MinimalValue {

	public static void main(String[] args) {
		int[] array = new int[] { 64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36 };

		int minValue = array[0];
		int minindex = 0;

		for (int i = 1; i < array.length; i++) {
			if (array[i] < minValue) {
				minValue = array[i];
				minindex = i;
			}
		}
		System.out.println("min value = " + minValue);
		System.out.println("min index = " + minindex);
	}
}
