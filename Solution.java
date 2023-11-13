class Solution {
    public int solution(int[] A, int[] B) {

        int count = 1;
        int prev_end = B[0];
        
        for (int curr = 1; curr < A.length; curr++) {
            if (A[curr] > prev_end) {
                count++;
                prev_end = B[curr];
            }
        }
        
        return count;
    }
}