class Solution {
    public int solution(int M, int[] A) {
        int total = 0;
        for(int i = 0; i < A.length; i++){
            for(int j = i; j < A.length; j++){
                if(j == 0){
                    total += 1;
                }else if(A[j] != A[j-1]){
                    total += 1;
                }else if(i == j){
                    total += 1;
                }else{
                    break;
                }
            }
        }
        return total;
    }
}