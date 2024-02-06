class Solution {
    public int solution(int[] A) {

        int max = 0;

        for(int x = 0; x < A.length; x++){
            for(int y = x; y < A.length; y++){
                for(int z = y; z < A.length; z++){
                    
                    int sumA = 0;
                    int sumB = 0;
                    
                    for(int a = x+1; a < y; a++){
                        sumA += A[a];
                    }
                    for(int b = y+1; b < z; b++){
                        sumB += A[b];
                    }

                    int sum = sumA + sumB;
                    if (max < sum){
                        max = sum;
                    }
                }    
            }    
        }

        return max;
    }
}