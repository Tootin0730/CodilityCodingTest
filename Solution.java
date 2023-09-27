class Solution {
    public int solution(int[] A) {
        int sum = 0;
        for(int i = 0; i < A.length; i++){
            for(int j = i+1; j < A.length; j++){
                if(i+A[i] >= j-A[j]){
                    sum += 1;
                }
            }
        }
        return sum;
    }
}