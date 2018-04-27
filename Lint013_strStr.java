package chen.practice;

import com.sun.org.apache.bcel.internal.generic.ReturnaddressType;

/* For a given source string and a target string, you should 
 * output the first index(from 0) of target string in source string.
 * If target does not exist in source, just return -1.
 *
 *  @param source: source string to be scanned.
 *  @param target: target string containing the sequence of characters to match
 *  @return: a index to the first occurrence of target in source, or -1  if target is not part of source.
 */
public class Lint013_strStr {
	
	public int strStr(String source, String target) {
		if (source == null || target == null) {
			return -1;
		}
		int sLen = source.length();
		int tLen = target.length();
		for(int i = 0; i< sLen - tLen +1; i++) {
//			if (source.substring(i, i+tLen).equals(target)) {
//				return i;
//			}
			int j = 0;
			for(j = 0; j < tLen; j++) {
				if(source.charAt(i+j) != target.charAt(j))
					break;
			}
			if (j == tLen -1) {
				return i;
			}
			
		}
		return -1;
	}

}
