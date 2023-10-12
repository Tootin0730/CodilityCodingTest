import java.lang.Math;

class Solution {
    public int solution(int[] A) {

        int result = A[0];
        int previous = A[0];
        int len = A.length;

        for (int i = 1; i < len; i++) {
            previous = Math.max(A[i], A[i] + previous);
            result = Math.max(result, previous);
        }
        return result;
        
    }
}