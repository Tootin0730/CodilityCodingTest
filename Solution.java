import java.util.Arrays;
class Solution {

    public int solution(int[] A) {
        long[] A1 = new long[A.length];
        long[] A2 = new long[A.length];
        int i, j = 0, n = A.length;
        for (i = 0; i < n; i++) {
            A1[i] = i - (long)A[i];
            A2[i] = i + (long)A[i];
        }
        Arrays.sort(A1);
        Arrays.sort(A2);
        long intersectCount = 0;
        for (i = 0; i < n; i++)
            while (j < n && A2[i] >= A1[j]) {
                intersectCount += j;
                intersectCount -= i;
                j++;
            }
        if (intersectCount > 10000000)
            intersectCount = -1;
        return (int)intersectCount;
    }
}