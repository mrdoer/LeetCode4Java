package chen.practice;
/**
 * @param n: An integer
 * @return: True or false
 */

public class Lint142_PowerOf2 {
	public boolean checkPowerOf2(int n) {
	    return (n & (n-1)) == 0;
	}

}
