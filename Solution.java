class Solution {
    public int solution(int[] A) {
        int result = 0;

        for(int i = 1; i <= A.length; i++){
            for (int element : A) {
                if(element == i) {
                    result += 1;
                }
            }
        }

        if(result == A.length){
            return 1;
        }else{
            return 0;
        }
    }
}