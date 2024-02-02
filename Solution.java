import java.util.*;

class Solution {
    public int solution(int[] A) {                      
        Map <Integer, Integer> map = new HashMap<>();
        int N = A.length;
        for(int i=0; i<N; i++) {
            if(map.containsKey(A[i])) {
                map.put(A[i], map.get(A[i]) + 1);
            } else {
                map.put(A[i], 1);
            }
        }
        int max = 0;
        int maxCount= 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(maxCount < entry.getValue()) {
                maxCount = entry.getValue();
                max = entry.getKey();
            }
        }
        
        if(maxCount <= N/2) {
            return 0;
        }
    
        int leaderCount = 0;
        int equiCounter = 0; 
        for(int S=0; S<N-1; S++) {
            if(A[S] == max) {
                leaderCount++;
            }
            if((leaderCount>((S+1)/2)) && ((maxCount - leaderCount) > (N - (S+1))/2)) {
                equiCounter++;
            }
        }
        
        return equiCounter;

    }
}