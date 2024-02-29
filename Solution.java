class Solution {
    public int solution(int M, int[] A) {

        boolean[] seen = new boolean[M+1];

        int p = 0;
        int q = 0;
        int count = 0;

        while (p < A.length && q < A.length) {
            if (seen[A[q]] == true) {
                seen[A[p]] = false;
                p++;
            }
            else {
                seen[A[q]] = true;
                count += (q - p + 1); 
                q++;
            }
            if (count > 1000_000_000) return 1000_000_000;

        }
        return count;
    }
}