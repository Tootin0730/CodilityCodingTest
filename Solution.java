class Solution {
    public int solution(int[] A) {

        int difference;
        int minimum = 100000;
        
        for(int i = 0; i < A.length; i++){
            int up = 0;
            for(int j = i+1; j < A.length; j++){
                up += A[j];
            }
            difference = A[i] - up;
            if (difference < 0){
                difference = 0 - difference;
            }

            minimum = Math.min(minimum, difference);
        }
        return minimum;
    }
}

