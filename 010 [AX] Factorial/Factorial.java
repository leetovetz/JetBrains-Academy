// The task. 
// Create a program that will read the number factorial. 
// The factorial is 5! = 5 * (4 * 3 * 2 * 1) = 120

public class Factorial {

	public static void main(String[] args) {
		System.out.println(factorial(10));

	}
	public static int factorial(int n) {
		if(n == 1) {
			System.out.println("factorial(" + n + ") = 1");
			return 1;
		} else {
			System.out.println("factorial(" + n + ") = " + n + " * factorial(" + (n - 1) + ")");
			return n * factorial(n - 1);
		}
	}

}



