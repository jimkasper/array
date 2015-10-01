/*
 *	ARRAY REVERSAL
 *	
 *	Write code in the indicated area below to reverse the order of the elements
 *  of the "numbers" array.
 *  
 *	Example:
 *  The following is example output after a successful implementation:
 *	
 *		Before reversal: {2, 4, 9, 10, 4, 3, 7, 6, 1, 8}
 *	    After reversal: {8, 1, 6, 7, 3, 4, 10, 9, 4, 2}	
*/
import java.util.Random;

public class ReverseArray {
	public static void main(String[] args) {
		int[] numbers = new int[10];  // This is the array to reverse
		Random rand = new Random();
		System.out.print("Before reversal: {");
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = rand.nextInt(10)+1;
			System.out.print(numbers[i]);
			if(i < numbers.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("}");
		// ∧ ∧ ∧ ∧ ∧ ∧ ∧ LEAVE THE CODE ABOVE THIS LINE ALONE!!! ∧ ∧ ∧ ∧ ∧ ∧ ∧ 
		
		// YOUR CODE TO REVERSE THE CONTENTS OF THE numbers ARRAY GOES HERE
		
		// ∨ ∨ ∨ ∨ ∨ ∨ ∨ LEAVE THE CODE BELOW THIS LINE ALONE!!! ∨ ∨ ∨ ∨ ∨ ∨ ∨ 
		System.out.print("After reversal: {");
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]);
			if(i < numbers.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("}");
	}
}