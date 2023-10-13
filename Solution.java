class Solution {
    public int solution(int[] A) {
        int n = A.length;
        int[] maxSumStart = new int[n];
        int[] maxSumEnd = new int[n];
        for (int i = 1, j = n-2; i < n-1; i++, j--) {
            maxSumEnd[i] = Math.max(0, maxSumEnd[i-1] + A[i]);
            maxSumStart[j] = Math.max(0, maxSumStart[j+1] + A[j]);
        }
        int maxSum = Integer.MIN_VALUE;
        for (int i = 1; i < n-1; i++)
            maxSum = Math.max(maxSum, maxSumEnd[i-1] + maxSumStart[i+1]);
        return maxSum;
    }
}