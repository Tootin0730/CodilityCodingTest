class Solution {
    public int[] solution(int[] A) {
        int[] B = {0, 0, 0, 0, 0};

        for(int i = 0; i < A.length; i++){
            int num = 0;
            for(int j = 0; j < A.length; j++){
                if(A[i] % A[j] != 0){
                    num += 1;
                }
            }
            B[i] = num;
        }
        return B;
    }
}