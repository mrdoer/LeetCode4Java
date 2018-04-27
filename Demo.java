package chen.practice;

public class Demo {
	public static void main(String[] args) {
	//	char[] a = new char[5];
	//	int[] a_int = new int[]{1,2,3,4,5};
	//	String s = new String("hello");
	//	a = s.toCharArray();
	//	String s1 = s.valueOf(123);
	//	StringBuffer buf = new StringBuffer();
	//	buf.append(s1);
	//	System.out.println(buf);
		double b = 4;
		int a = 2;
		long c_long = a;
		a = (int) c_long;
//		System.out.println(b==a*a);
		int[][] matrix = new int[4][5];
		int[][] array = null;
		
// 		System.out.println(array.length);
		System.out.println(matrix.length+" " + matrix[0].length);
	}
}
