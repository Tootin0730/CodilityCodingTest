class Solution {
    public int solution(int[] A) {
        int sum = 0;
        for (int i = 0; i < A.length; i++){
            sum = sum + A[i];
        }

        int total = 0;
        for (int j = 1; j <= A.length+1; j++){
            total = total + j;
        }
        
        int result = total - sum;

        return result;
    }
}
