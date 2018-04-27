package chen.practice;

import java.util.Scanner;
/*
 * 编写一个函数，计算字符串中含有的不同字符的个数。
 * 字符在ACSII码范围内(0~127)。
 * 不在范围内的不作统计。
 */
public class CountChars {
	public static int countChars() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int[] arr = new int[128];
		int count = 0;
		
		for(int i = 0; i < str.length();i++) {
			if(str.charAt(i) >= 0 && str.charAt(i) <=127) {
				arr[str.charAt(i)] = 1;
			}
		}
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]==1)
				count++;
		}
		
		
		return count;
		
	}
	public static void main(String[] args) {
		System.out.println(countChars());
	}
}
