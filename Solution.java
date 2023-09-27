import java.util.*;

class Solution {
    public int solution(int[] A) {
        long[] lKth = new long[A.length];
        long[] rJth = new long[A.length];
        
        for (int i = 0; i < A.length; i++) {
            lKth[i] = (long) i - A[i];
            rJth[i] = (long) i + A[i];
        }
        
        Arrays.sort(lKth);
        Arrays.sort(rJth);
        
        int cnt = 0;
        int j = 0;
        for (int i = 0; i < A.length - 1; i++) {
            while (j < A.length && rJth[i] >= lKth[j]) {
                cnt += j - i;
                j++;
                
                if (cnt > 10000000)
                    return -1;
            }
        }
        
        return cnt;
    }
}