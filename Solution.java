class Solution {
    public int solution(int A, int B, int K) {
        int prevCount = A>0 ? (A-1)/K : -1;
        return B/K - prevCount;
    }
}
