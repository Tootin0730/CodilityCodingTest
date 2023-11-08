import java.util.*;

class Solution {
    public int solution(int[] A) {
        int N = A.length;
        Arrays.sort(A);
        int result = 0;
        for (int i=0; i < N; i++) {
            int k = i + 2;
            for (int j=i+1; j < N; j++) {
                while(k<N && A[i]+A[j]>A[k]) {
                    k++;    
                }
                result += k-j-1; 
            }
        }
        return result;
        
    }
}