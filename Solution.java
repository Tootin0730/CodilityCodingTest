class Solution {
    public int solution(int N) {
        int min = 1+N;
        int i=1;
        while(i*i<=N) {
            if(N % i == 0) {
                min = Math.min(min, N/i+i);
            }
            i++;
        }
        return 2*min;
    }
}