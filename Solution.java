class Solution {
    public int solution(int[] A) {

        int total = 0;

        for(int i = 0; i < A.length; i++){
            for(int j = i+1; j < A.length; j++){
                for(int k = j+1; k < A.length; k++){
                    if(A[i] < A[j] + A[k] && A[j] < A[i] + A[k] && A[k] < A[i] + A[j]){
                        total += 1;
                    }
                }
            }
        }
        return total;
    }
}
