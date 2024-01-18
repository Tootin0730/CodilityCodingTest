class Solution {
    public int solution(int[] A) {
        int check = 1;

        for (int element : A) {
            for(int i = 1; i < 100000; i++){
                if (element != i) {
                    check = i;
                    break;
                }
            }    
        }
        return check;
    }
}