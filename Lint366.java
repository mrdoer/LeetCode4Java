package chen.practice;
/*
 * Fibonacci
 */
public class Lint366 {
	// ÔËÐÐÂý
	public int fibonacci(int n) {	
		if(n <= 2)
			return n-1;
		else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
	public int fibonacciFor(int n) {
		int result = 0;
		int a = 0;
		int b = 1;
		if( n<= 2)
			return n-1;
		else {
			for(int i = 3; i<=n; i++) {
				result = a + b;
				a = b;
				b = result;
			}
			return result;
		}
	}
}
