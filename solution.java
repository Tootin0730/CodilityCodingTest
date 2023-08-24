import java.util.*;

class Solution {
    public int solution(int[] A) {
        int result = 0;

        Arrays.sort(A);

        for(int i=0;i<A.length;i+=2){
            if(i+1 == A.length){
                result = A[i];
            }else if(A[i] != A[i+1]){
                result = A[i];
                break;
            }
        }
        
        return result;
    }
}