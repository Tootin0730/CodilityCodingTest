class Solution {
    public int solution(int[] A) {

        int total = 0;
        for(int i = 0; i < A.length+1; i++){
            total += i;
        }

        int missing = 0;
        for(int j = 0; j < A.length; j++){
            missing += j;
        }

        int result = total - missing;
        
        return result;
    }
}