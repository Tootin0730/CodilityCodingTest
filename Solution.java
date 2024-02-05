class Solution {
    public int solution(int[] A) {
        int max = 0;

        for(int i = 0; i < A.length; i++){
            for(int j = i; j <A.length; j++){
                int candidate = 0;
                for(int num = i; num < j; num++){
                    candidate += A[num];
                }

                if(candidate > max){
                    max = candidate;
                }
            }
        }
        return max;
    }
}