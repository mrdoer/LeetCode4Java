package chen.practice;

import java.util.Scanner;

public class Main1 {
	/**
	 * 10�� ��дһ����ȡ�ַ����ĺ���������Ϊһ���ַ������ֽ��������Ϊ���ֽڽ�ȡ���ַ�����
	 * ����Ҫ��֤���ֲ����ذ�����硰��ABC��4��Ӧ�ý�Ϊ����AB�������롰��ABC��DEF����6��Ӧ�����Ϊ����ABC�������ǡ���ABC+���İ������
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
//		        ��Stringת����byte�ֽ�����

		if (len > byteNum) {
			len = byteNum;
		}

		int num=0;
		// �ж��Ƿ�����˽ذ룬�ذ�Ļ��ֽڶ��ڵ�ASC����С��0��ֵ
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
				String subStrx = new String(bt, 0, len,"GBK");//ǰ�����󲻰���
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
