class Solution {
    public int solution(int[] A, int[] B) {
        int num = 1;
        for(int i = 0; i < A.length-1; i++){
            if(A[i+1] < A[i] ||  B[i] < A[i+1]){
                if(B[i+1] < A[i+2] || A[i] < B[i+1]){
                    num += 1;
                }
            }
        }
        return num;
    }
}