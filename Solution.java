import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
        int N = A.length;

        if (N < 3)
            return 0;

        Arrays.sort(A);
        int result = 0;
        
        for (int i = 0; i < N; i++) {
            int k = i + 1;
            for (int j = i + 1; j < N; j++) {
                while (k < N && A[i] + A[j] > A[k])
                    k++;
                result += k - j - 1;
            }
        }
        return result;
    }
}