/* 
 * Task. S.3.4.
 * Arithmetic mean of array elements.
 */


import java.util.Arrays;
import java.util.Random;

public class ArithmeticMeanArray {

	public static void main(String[] args) {
		final int length = 5;
        final int[] array = randomArray(length);
        final int arithmeticalMean = arithmeticalMean(array);
        System.out.println(Arrays.toString(array));
        System.out.println(arithmeticalMean);

	}
	private static int[] randomArray(final int length) {
        final Random random = new Random();
        final int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }

    private static int arithmeticalMean(final int[] array) {
        long sum = 0;
        for (int value : array) {
            sum += value;
        }
        return (int) (sum / array.length);
    }
}

