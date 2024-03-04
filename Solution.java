class Solution {
    public int solution(int[] A) {
        
        int pairNum= 0;
        for(int n = A.length+1; n > 0; n--){
            pairNum += n-1;
        }

        int pair;
        int min = 0;
        for(int i = 0; i < A.length; i++){
            for(int j = i; j < A.length; j++){

                pair = A[i] + A[j];
                if(pair < 0){
                    pair = -pair;
                }

                if(min == 0){
                    min = pair;
                } else {
                    min = Math.min(pair, min);
                }
            }
        }
        return min;
    }
}