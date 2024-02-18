class Solution {
    public int solution(int[] A, int[] B) {
        int totalA = 0;
        int totalB = 0;
        int total = 0;
        for(int i = 0; i < A.length; i++){
            for (int divisorA = 2; divisorA < A.length; divisorA++){
                if(A[i] % divisorA == 0){
                    totalA += divisorA;
                }
            }
            
            for (int divisorB = 2; divisorB < A.length; divisorB++){
                if(B[i] % divisorB == 0){
                    totalB += divisorB;
                }
            }
        }

        if(totalA == totalB){
            total += 1;
        }

        return total;
    }
}