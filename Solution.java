class Solution {
    public int solution(int N) {

        int sum = 0;

        for(int i = 1; i < N+1; i++){
            if(N % i == 0){
                sum += 1;
            }
        }

        return sum;
    }
}