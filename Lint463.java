package chen.practice;

/*
 * 
 * Given an integer array, sort it in ascending order. Use selection sort, 
 * bubble sort, insertion sort or any O(n2) algorithm.
 * 
 */
public class Lint463 {
	public void sortIntergers(int[] A) {
		int k = 0;
		for(int i = 0; i < A.length; i++) {
			k = i;
			for(int j = i; j < A.length; j++) {
				if(A[j] < A[k]) {
					k = j;					
				}
			}
			int tmp = A[i];
			A[i] = A[k];
			A[k] = tmp;			
		}
	}

}
