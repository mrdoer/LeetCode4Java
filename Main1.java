package chen.practice;

import java.util.Scanner;

public class Main1 {
	/**
	 * 10、 编写一个截取字符串的函数，输入为一个字符串和字节数，输出为按字节截取的字符串。
	 * 但是要保证汉字不被截半个，如“我ABC”4，应该截为“我AB”，输入“我ABC汉DEF”，6，应该输出为“我ABC”而不是“我ABC+汉的半个”。
	 * 
	 * @author 
	 */
	public static void main(String[] args) {
		splitString();
	}
//
	private static String src = null;
	private static int len = 0;
	public static void show(String str) {
		for(int i = 0; i < str.length();i++) {
			if(!(str.charAt(i)>=48 && str.charAt(i)<=57))
		 		System.out.print(str.charAt(i));
		}
	}

	public static void splitString() {
		Scanner sc = new Scanner(System.in);
		src = sc.nextLine();
		len = sc.nextInt();
		int byteNum = 0;

		if (null == src) {
			System.out.println("The source String is null!");
			return;
		}

		
		byte bt[]=null;
		try {
			bt = src.getBytes("GBK");

			byteNum = bt.length;
//		        将String转换成byte字节数组

		if (len > byteNum) {
			len = byteNum;
		}

		int num=0;
		// 判断是否出现了截半，截半的话字节对于的ASC码是小于0的值
		if (bt[len-1] < 0) {
			for (int j=0;j<=len-1;j++)
			{
				if (bt[j]<0)
				{
					num++;
					num = num%2;
				}
				else
				{
					num=0;
				}
			}
			
			if (num==0)
			{
				String subStrx = new String(bt, 0, len,"GBK");//前包括后不包括
				show(subStrx);
			}
			else
			{
				String subStrx = new String(bt, 0, len-1,"GBK");
				show(subStrx);
			}
			
		} else {
			String subStrx = new String(bt, 0, len,"GBK");
			show(subStrx);
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
