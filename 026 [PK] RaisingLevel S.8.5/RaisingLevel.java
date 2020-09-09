/*
 * Task. S.8.5
 * Calculate x^n.
 */


public class RaisingLevel {

	public static void main(String[] args) {
		Calculate();

	}
	private static void Calculate() {
        final int x = 2;
        final int n = 10;
        final int pow = pow(x, n);
        System.out.println(x + "^" + n + " = " + pow);
    }
	private static int pow(int x, int n) {
		int result = 1;
        for (int i = 0; i < n; i++) {
            result *= x;
        }
        return result;
	}
}
