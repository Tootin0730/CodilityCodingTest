class Solution {
    public int[] solution(int N, int[] P, int[] Q) {
        int[] F = new int[N+1];
        int f = 2;
        while (f * f <= N) {
            if (F[f] == 0) {
                int K = f * f;
                while (K <= N) {
                    if (F[K] == 0) {
                        F[K] = f;
                    }
                    K += f;
                }
            }
            f += 1;
        }

        int M = P.length;
        int[] isSemiprime = new int[N + 1];
        for (int i = 0; i < M; i++) {
            int start = P[i], end = Q[i];
            P[i] = 0;
            for (int j = start; j <= end; j++) {
                if (isSemiprime[j] == 0){       
                    isSemiprime[j] = -1;        
                    if (F[j] > 0) {
                        int x = j / F[j];
                        if (F[j / F[j]] == 0) {
                            isSemiprime[j] = 1;
                        }
                    }
                }
                P[i] += isSemiprime[j] > 0 ? 1 : 0;
            }
        }

        return P;
    }
}