package chen.practice;

/*Write an efficient algorithm that searches for a value in an m x n matrix.
  This matrix has the following properties:
  Integers in each row are sorted from left to right.
  The first integer of each row is greater than the last integer of the previous row.
 */
public class Lint28_Search2DMatrix {
	/**
     * @param matrix: matrix, a list of lists of integers
     * @param target: An integer
     * @return: a boolean, indicate whether matrix contains target
     */
    public boolean searchMatrix(int[][] matrix, int target) {
    	
    	if(matrix == null || matrix.length == 0)
            return false;
        int m = matrix.length;
    	int n = matrix[m-1].length;
    	long low = 0;
    	long high = m*n-1;
    	while(low <= high ) {
    		long mid = (low+high)/2;
    		if (matrix[(int) (mid/n)][(int) (mid%n)] > target) {
				high = mid - 1;
			}
    		if (matrix[(int) (mid/n)][(int) (mid%n)] < target) {
    			low = mid + 1;
    		}
    		if (matrix[(int) (mid/n)][(int) (mid%n)] == target) {
    			return true;
    		}
    	 }
    	 return false;
    }
}
