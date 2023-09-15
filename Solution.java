class Solution {
    public int solution(int A, int B, int K) {
        int b = (B/K) + 1;
        int a = (A/K) + 1;

        if (A%K == 0) {
            --a;
        }
        return b-a;
    }
}