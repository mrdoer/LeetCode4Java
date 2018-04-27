package chen.practice;



/*
 * Reverse a 3-digit integer.
 * Reverse 123 you will get 321.
 * Reverse 900 you will get 9.
 */

public class Lint037 {
	public static int reverseInteger(int number) {
		
		int result = 0;
		while(number != 0) {
			result = result*10 + number%10;
			number = number/10;
		}
		return result;
	}

	
}
