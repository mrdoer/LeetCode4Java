package chen.practice;

/*
 * Write a function that add two numbers A and B. 
 * You should not use + or any arithmetic operators.
 * 
 * 1. a^b ������ ����λ�ӷ�
 * 2. a&b << 1 ȷ����λ��λ��
 * 3. ������Ҫ�ٽ�λʱ��ʾ�������
 */
public class Lint001 {

	public int aplusb(int a, int b) {
		int a_,b_;
		while(b != 0) {
			 a_ = a ^ b;
			 b_ = (a & b) << 1;
			
			 a = a_;
			 b = b_;
		}
		
		return a;
	}
//public static void main(String[] args) {
//	
//}
}
