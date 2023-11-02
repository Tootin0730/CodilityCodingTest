class Solution {
    public int solution(int[] A) {
        int sum = 0;
        int minus = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i] < 0){
                for(int j = i; j < A.length; j++){
                    if(A[i] == 0-A[j]){
                        minus += 1;
                    }
                }
            }
            sum += 1;
        }
        sum = sum - minus;
        return sum;
    }
}