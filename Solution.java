class Solution {
    public int solution(int[] A, int[] B, int[] C) {
        int add = 0;
        int result = 0;

        for(int j = 0; j < C.length; j++){
            for(int i = 0; i < A.length; i++){
                if (A[i] <= C[j] && C[j] <= B[i]){
                    add += 1;
                }
            }
            if(add == A.length){
                result =  add;
            } else if (add == 0){
                result = -1;
            }
        }
        return result;
    }
}