class Solution {
    public int solution(int A, int B, int K) {

        int total = 0;

        for(int i = A; i <= B; i++){
            if(i % K == 0){
                total += 1;;
            }
        }
        return total;
    }
}