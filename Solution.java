class Solution {
    public int solution(int[] A) {
        int sum = 0;
        int check = 0;
        int minus = 0;

        for(int i = 0; i < A.length; i++){
            check = 0-A[i];
            for(int j = i+1; j < A.length; j++){
                if(A[j] == check){
                    minus += 1;
                }
            } 
            sum += 1;
        }
        sum = sum-minus;
        return sum;
    }
}