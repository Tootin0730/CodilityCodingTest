class Solution {
    public int solution(int[] A) {
        int rightSum = 0;
        int leftSum = 0;
        int result = Integer.MAX_VALUE;

        for(int i=0; i<A.length; i++){
            rightSum += A[i];
        }

        int temp = 0;

        for(int i=1; i<A.length; i++){
            rightSum -= A[i-1];
            leftSum += A[i-1];
            temp = Math.abs(rightSum -leftSum);
            if(temp<result) result = temp;
        }
        return result;
    }
}