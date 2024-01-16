import java.util.*;

class Solution {
    public int solution(int X, int[] A) {
        
        int time = 0;
        
        Set<Integer> leavesNeeded = new HashSet<Integer>();
        
        for(int i = 0; i < A.length; i++){
            
            if(A[i] <= X){
                leavesNeeded.add(A[i]);
            }
            if( leavesNeeded.size() == X){
                return i;
            }
        }
        return -1;
    }
}