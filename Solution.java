class Solution {
    public int solution(int N) {
        int sqrtN = (int)Math.sqrt(N);
        if (sqrtN * sqrtN == N)
            return sqrtN * 4;
        int i = sqrtN;
        while (N % i != 0)
            i--;
        return (i + (N / i) ) * 2;
    }
}