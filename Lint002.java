package chen.practice;

import java.util.Scanner;

/*
 * Write an algorithm which computes the number of trailing zeros in n factorial.
 * 11! = 39916800, so the out should be 2
 * 
 * ˼·
 * z = n/5 + n/(5*5) + n/(5*5*5) +��+(ֱ��nС��n��a����) 
 * n/5��ʾ�ܱ�5��������(���ڵ���5������eg. 5,10,15,20��)�����Թ���һ��5��
 * n/(5*5)��ʾ�ܱ�25��������(eg. 25,50,75,100��),�����ٹ���һ��5;
 * �Դ����ƣ��ͻ�ó����е���Ŀ�� 
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
