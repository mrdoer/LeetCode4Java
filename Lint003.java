package chen.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/*
 * Ugly number is a number that only have factors 2, 3 and 5.
 * Design an algorithm to find the nth ugly number. 
 * The first 10 ugly numbers are 1, 2, 3, 4, 5, 6, 8, 9, 10, 12...
 * If n=9, return 10.
 */

public class Lint003 {
    public static int nthUglyNumber(int n) {
    	 List<Integer> uglys = new ArrayList<Integer>();
         uglys.add(1);
         
         int p2 = 0, p3 = 0, p5 = 0;
         // p2, p3 & p5 share the same queue: uglys

         for (int i = 1; i < n; i++) {
             int lastNumber = uglys.get(i - 1);
             while (uglys.get(p2) * 2 <= lastNumber) p2++;
             while (uglys.get(p3) * 3 <= lastNumber) p3++;
             while (uglys.get(p5) * 5 <= lastNumber) p5++;
             
             uglys.add(Math.min(
                 Math.min(uglys.get(p2) * 2, uglys.get(p3) * 3),
                 uglys.get(p5) * 5
             ));
         }

         return uglys.get(n - 1);
    }
    
    public int nthUglyNumber2(int n) {
        // Write your code here
        Queue<Long> Q = new PriorityQueue<Long>();
        HashSet<Long> inQ = new HashSet<Long>();
        Long[] primes = new Long[3];
        primes[0] = Long.valueOf(2);
        primes[1] = Long.valueOf(3);
        primes[2] = Long.valueOf(5);
        for (int i = 0; i < 3; i++) {
            Q.add(primes[i]);
            inQ.add(primes[i]);
        }
        Long number = Long.valueOf(1);
        for (int i = 1; i < n; i++) {
            number = Q.poll();
            for (int j = 0; j < 3; j++) {
                if (!inQ.contains(primes[j] * number)) {
                    Q.add(number * primes[j]);
                    inQ.add(number * primes[j]);
                }
            }
        }
        return number.intValue();
    }
    public static void main(String[] args) {
		System.out.println(Lint003.nthUglyNumber(10));
	}
}
