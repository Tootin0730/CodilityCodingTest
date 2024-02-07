class Solution {
    public int solution(int N) {

        int total = 0;

        for(int D = 1; D <= N; D++){
            if(N % D == 0){
                total += 1;
            }
        }

        return total;
    }
}