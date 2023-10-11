class Solution {
    public int solution(int[] A) {
        int max = 0;

        for (int i = 0; i < A.length; i++){
            for(int j = i+1; j < A.length; j++){
                if (A[j] > A[i]){
                    if(max < A[j] - A[i]){
                        max = A[j] - A[i];
                    }
                }
            }
        }
        return max;
    }
}