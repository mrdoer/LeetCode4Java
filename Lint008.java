package chen.practice;

import oracle.jrockit.jfr.ActiveRecordingEvent;

/**
 * @param str: An array of char
 * @param offset: An integer
 * @return: nothing
 * offset=0 => "abcdefg"
 * offset=1 => "gabcdef"
 * offset=2 => "fgabcde"
 * offset=3 => "efgabcd"
 */

public class Lint008 {
	@SuppressWarnings("unused")
	public void rotateString(char[] str, int offset) {
		
		
		if (str == null || str.length == 0) {
			return;
		}
		int len = str.length;
		offset = offset%len;
		reverse(str, 0, len-offset-1);
		reverse(str, len-offset, len-1);
		reverse(str, 0, len-1);
		
	}
	public void reverse(char[] string, int start, int end) {
		while(start < end) {
			char c = string[start];
			string[start] = string[end];
			string[end] = c;
			start++;
			end--;
		}
	}
	public static void main(String[] args) {
		char[] str = "".toCharArray();
		new Lint008().rotateString(str, 2);
		System.out.println(str);
	}
}
