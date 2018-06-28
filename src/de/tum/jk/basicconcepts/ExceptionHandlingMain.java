package de.tum.jk.basicconcepts;

public class ExceptionHandlingMain {

	public static void main(String[] args) {

		// EXCEPTION HANDLING
		System.out.println("\nSTART --- EXCEPTION HANDLING\n");
		int[] numbers = { 1, 2, 3, 4, 5 };
		System.out.println("Array at position 0: " + numbers[0]);
		System.out.println("Array at position 4: " + numbers[4]);
		// Reached Maximum on numbers[4];
		// The following line will fail with an ArrayOutOfBounds Exception
		// System.out.println("Array at position 5: "+numbers[5]);

		try {
			System.out.println(numbers[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Cant access element outside of array - taking last item as workaround");
			System.out.println("Original error message: " + e);
			int index = numbers.length - 1; // last element
			System.out.println("Array at position " + index + ": " + numbers[index]);
		}

		System.out.println("\nEND --- EXCEPTION HANDLING\n");
	}
}
