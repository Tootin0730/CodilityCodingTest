class Solution {
    public int solution(int[] A) {

        int len = A.length;
        int[] sum = new int[len];
        sum[0] = A[0];

        for (int i = 1; i < len; i++) {
                    sum[i] = sum[i-1] + A[i];
        }

        int min = Math.abs(sum[len-1] -2*sum[0]);
        for (int i = 2; i < len; i++) {
            int temp = Math.abs(sum[len-1] -2*sum[i-1]);
            if (temp < min)
                min = temp;
        }
        
        return min;
    }
}

