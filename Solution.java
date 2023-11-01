class Solution {
    public int solution(int K, int M, int[] A) {
        int min = 0;
        int max = 0;
        for (int i = 0; i < A.length; i++) {
            max += A[i];
            min = Math.max(min, A[i]);
        }
        int result = max;
        while (min <= max) {
            int mid = (min + max) / 2;
            if (divisionSolvable(mid, K - 1, A)) {
                max = mid - 1;
                result = mid;
            } else {
                min = mid + 1;
            }
        }
        return result;
    }
    private boolean divisionSolvable(int mid, int k, int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            if (sum > mid) {
                sum = a[i];
                k--;
            }
            if (k < 0) {
                return false;
            }
        }
        return true;
    }
}