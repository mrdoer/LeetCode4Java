package chen.practice;

import java.util.Scanner;
/*
 * ��дһ�������������ַ����к��еĲ�ͬ�ַ��ĸ�����
 * �ַ���ACSII�뷶Χ��(0~127)��
 * ���ڷ�Χ�ڵĲ���ͳ�ơ�
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
