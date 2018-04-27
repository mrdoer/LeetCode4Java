package chen.practice;
/*
 * Merge two given sorted integer array A and B into a new sorted integer array.
 * 
 * @param A: sorted integer array A
 * @param B: sorted integer array B
 * @return: A new sorted integer array
 */
public class Lint006 {
    public static int[] mergeSortedArray(int[] A, int[] B) {
    	int lenA = A.length;
    	int lenB = B.length;
    	int indexA = 0, indexB = 0;
    	int len = lenA + lenB;
    	int[] M = new int[len];
    	for(int i = 0; i< len; i++) {
/*    		if(indexA < lenA && indexB < lenB) {
    			if(A[indexA] < B[indexB]) {
    				M[i] = A[indexA++];
    			}else
    				M[i] = B[indexB++];
    		}else if(indexA < lenA)
    					M[i] = A[indexA++];
    				else if(indexB < lenB)
    					M[i] = B[indexB++];
*/
    		if(indexA < lenA && indexB < lenB)
    			M[i] = (A[indexA] < B[indexB]) ? A[indexA++] : B[indexB++];
    			else if(indexA < lenA)
    					M[i] = A[indexA++];
    				else if(indexB < lenB)
    					M[i] = B[indexB++];
    	}
    	return M;
    }
    public static void main(String[] args) {
		int[] A = new int[] {1,2,3,4,10};
		int[] B = new int[] {2,3,5,6,7};
        int[] M = Lint006.mergeSortedArray(A, B);
        for(int i=0;i<M.length;i++) {
        	System.out.println(M[i]);
        }
	}
}
