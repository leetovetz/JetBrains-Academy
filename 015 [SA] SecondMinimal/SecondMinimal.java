/*
 * The task. Find the second smallest element in the array. 
 */

public class SecondMinimal {

	public static void main(String[] args) {
		
		int [] array = new int[] {85, 36, 49, 81, 15, 53, 16, 20, 57, 42, 54, 57, 86};

        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
        	
            if (array[i] < min) {
                min2 = min;
                min = array[i];
                
            } else if (array[i] < min2 && array[i] != min) {
                min2 = array[i];
            }
        }

        if (min2 != Integer.MAX_VALUE) {
        	
            System.out.println("The second smallest element in the array: " + min2);
            
        } else {
            System.out.println("There is no second smallest element.");
        }

        System.out.println("Minimal element in the array: " + min);
    }
}