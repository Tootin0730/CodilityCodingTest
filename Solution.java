import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
        Arrays.sort(A);
        int n = A.length - 1;
        return Math.max(A[n-2] * A[n-1] * A[n], A[0] * A[1] * A[n]);
    }
}