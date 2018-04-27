package chen.practice;

import java.util.Scanner;

/*
 * Write an algorithm which computes the number of trailing zeros in n factorial.
 * 11! = 39916800, so the out should be 2
 * 
 * 思路
 * z = n/5 + n/(5*5) + n/(5*5*5) +…+(直到n小于n的a次幂) 
 * n/5表示能被5整除的数(大于等于5的数，eg. 5,10,15,20等)，可以贡献一个5；
 * n/(5*5)表示能被25整除的数(eg. 25,50,75,100等),可以再贡献一个5;
 * 以此类推，就会得出所有的数目。 
 */
public class Lint002 {
	public static long trailingZros(long n){
		long num=0;
		
		while(n > 0) {
	            num += n / 5;
	            n /= 5;
	            System.out.println(n);
        }
		return num;
	}
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		System.out.println(Lint002.trailingZros(n));
	}
}
