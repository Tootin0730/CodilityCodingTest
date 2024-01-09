class Solution {
    public int[] solution(int[] A, int K) {
        int [] B = new int [A.length];

        for(int i = 0; i < A.length; i++){
            if(i+K <= A.length-1){
                B[i] = A[i+K];
            }else if(i+K > A.length-1){
                B[i] = A[i+K-A.length];
            }
        }
        return B;
    }
}