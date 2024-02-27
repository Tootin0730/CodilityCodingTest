class Solution {
    public int solution(int[] A) {

        int total = 0;
        for(int i = 0; i < A.length; i++){
            total += 1;
            for(int j = i+1; j < A.length; j++){
                if(A[i] == 0-A[j]){
                    total -= 1;
                }
            }
        }
        return total;
    }
}