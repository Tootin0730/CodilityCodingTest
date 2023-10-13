import java.lang.Math.*;

class Solution {
    public int solution(int[] A) {
        int big = 0;
        int next = 0;

        for (int i = 0; i < A.length-2; i++){
            for (int j = i; j < A.length-1; j++){
                for (int k = j; k < A.length; k++){

                    for(int bet1 = i+1; bet1 < j; bet1++){
                        next += A[bet1];
                    }

                    for(int bet2 = j+1; bet2 < k; bet2++){
                        next  += A[bet2];
                    }
                    big = Math.max(big, next);
                    next = 0;
                }
            }   
        }
        return big;
    }
}