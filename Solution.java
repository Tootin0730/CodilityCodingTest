class Solution {
    public int solution(int[] A) {
        int currentSum = Integer.MIN_VALUE + 1000001;
        int maxSum = Integer.MIN_VALUE + 1000001;
        for (int a : A) {
            currentSum = Math.max(currentSum + a, a);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}