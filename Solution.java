class Solution {
    public int solution(int[] A) {

        int N = A.length;
        int sum = 0;
        for(int i = 1; i < N-1; i++){
            if(A[i] > A[i-1] && A[i] > A[i+1]){
                sum += 1;
            }
        }
        return sum;
    }
}