package chen.practice;
/*
 * 由于计算mid时，首尾求和可能导致int型溢出，所以使用long接收比较合适
 */
import java.util.Scanner;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class Lint141_Sqrt {
	/**
     * @param x: An integer
     * @return: The sqrt of x
     * log(x)
     */
    public int sqrt(int x) {
    	
    	int start = 0;
    	int end = x;
		
        while(start <= end && x > 1) {
        	
        	long mid = (start+end)/2;
        	System.out.println(start + " "+mid+ " " + end + " ||" + mid*mid+" " +x);
  
        	if ( mid*mid == x ) {
        		return (int)mid;
			}
        	if (mid*mid < x) {
				if((mid+1)*(mid+1) > x)
					return (int)mid;
				start = (int)mid + 1;
			}
        	if (mid*mid > x) {
				if((mid-1)*(mid-1) < x)
					return  (int)mid-1;
				end = (int)mid - 1;
			}
        }
        return x;
	}
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	
    	while(true) {
    		int i = scanner.nextInt();
    		System.out.println(new Lint141_Sqrt().sqrt(i));
    	}
	}
}
