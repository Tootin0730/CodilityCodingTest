import java.util.Arrays;

class Solution {
	public static int solution(int[] A) {
		Arrays.sort(A);
		int dupl=0;
		for (int i = 1; i < A.length; i++) {
			if (A[i] == A[i-1])
				dupl++;
		}
		return A.length - dupl;
	}
}