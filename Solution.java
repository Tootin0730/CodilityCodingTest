class Solution {
    public int solution(int[] A) {
        double minAvg = (double)(A[0] + A[1]) / 2.0;
        int minAvgIndex = 0;
        int n = A.length;
        for (int i = 0; i < n-1; i++) {
            if ((double)(A[i] + A[i+1]) / 2.0 < minAvg) {
                minAvg = (double)(A[i] + A[i+1]) / 2.0;
                minAvgIndex = i;
            }
            if (i < n-2 && (double)(A[i] + A[i+1] + A[i+2]) / 3.0 < minAvg) {
                minAvg = (double)(A[i] + A[i+1] + A[i+2]) / 3.0;
                minAvgIndex = i;
            }
        }
        return minAvgIndex;
    }
}