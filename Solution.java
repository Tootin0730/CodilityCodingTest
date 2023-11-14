class Solution {
    public int solution(int K, int[] A) {
        int N = A.length;
        int result = 0;
        int length = 0;
        for (int rope : A) {
            length += rope;
            if (length >= K) {
                result++;
                length = 0;
            }
        }
        return result;
    }
}