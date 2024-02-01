class Solution {
    public int solution(int[] A) {
        int max = 0;
        
        for(int i = 0; i < A.length; i++){
            int candidate = 0;

            for(int j = i+1; j < A.length; j++){
                if(A[i] == A[j]){
                    candidate += 1;
                }
            }
            
            if(candidate > max){
                max = candidate;
            }
        }
        return max;
    }
}