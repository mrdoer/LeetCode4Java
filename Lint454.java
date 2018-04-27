package chen.practice;
/*Implement a Rectangle class which include the following attributes and methods:
 *	1. Two public attributes width and height.
 *	2. A constructor which expects two parameters width and height of type int.
 *	3. A method getArea which would calculate the size of the rectangle and return.
 */
public class Lint454 {
    /*
     * Define two public attributes width and height of type int.
     */
    public int width;
    public int height;

    /*
     * Define a constructor which expects two parameters width and height here.
     */
    public Lint454(int width, int height) {
		this.height = height;
		this.width = width;
	}
    
    /*
     * Define a public method `getArea` which can calculate the area of the
     * rectangle and return.
     */
    public int getArea() {
		return width*height;
	}

}
