package chen.practice;

/*
 * 给定十进制数n，转换为k进制表示
 */
public class Lint763_HexConversion {

	public static String hexConversion(int n, int k) {
        String string = "";
//        char c = ' ';
//        int t = 0;
        if (n == 0) {
			return "0";
		}
		while(n > 0) {
			int t = n % k;
			char c = ' ';
			if (n > 9) 
				c = (char) ('A'+(t-10));
			else
				c = (char) ('0' + t);
			string = string + c;
			n = n/k;
		}
		return string;
    }
	
	public static String hex(int n, int k) {
		String res = "";
        if (n == 0) {
            return "0";
        }
        
        while (n > 0) {
            int t = n % k;
            char c = ' ';
            if (t <= 9) {
                c = (char)('0' + t);
            }
            else {
                c = (char)('A' + (t - 10));
            }
            
            res = c + res;
            n /= k;
        }
        
        return res;
	}
	public static void main(String[] args) {
		System.out.println(hexConversion(31, 16));		
	}
}
