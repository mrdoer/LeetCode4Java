package chen.practice;


/**
 * @param character: a character
 * @return: a character
 */
public class Lint145 {

    public char lowercaseToUppercase(char character) {
        // write your code here

        return (char) (character - 32);
    }
    public static void main(String[] args) {
		System.out.println(new Lint145().lowercaseToUppercase('b'));
	}
}
