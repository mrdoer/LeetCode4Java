package chen.practice;

/*
 * Write a function that add two numbers A and B. 
 * You should not use + or any arithmetic operators.
 * 
 * 1. a^b 异或操作 不进位加法
 * 2. a&b << 1 确定进位的位置
 * 3. 当不需要再进位时表示计算结束
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
