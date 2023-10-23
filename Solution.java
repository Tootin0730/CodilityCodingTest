class Solution {
    public int[] solution(int N, int[] P, int[] Q) {
        int length = P.length;
        int[] prime = sieve(N);
        int[] semiprime = semiprime(prime);
        int[] result = new int[length];
        int[] semiprimesAggreation = new int[N+1];
        
        for(int i=1;i<N+1;i++) {
            semiprimesAggreation[i] = semiprime[i];
            semiprimesAggreation[i] += semiprimesAggreation[i-1];    
        }
        
        for(int i=0;i<length;i++) { 
            result[i] = semiprimesAggreation[Q[i]] - semiprimesAggreation[P[i]] + semiprime[P[i]];
        }
        return result;
    }
    
    public int[] sieve(int N) {
        int[] prime = new int[N+1];
        for(int i=2; i<=(double)Math.sqrt(N); i++) {
            if(prime[i] == 0) {
                int k = i*i;
                while(k <= N) {
                    if(prime[k] == 0){
                        prime[k] = i;    
                    }                    
                    k += i;
                }               
            }
        }
        return prime;
    }
    
    public int[] semiprime(int[] prime) {
        int semiprime[] = new int[prime.length];
        for(int i=0;i<prime.length;i++) {
            if(prime[i] == 0) continue;
            int firstFactor = prime[i];
            if(prime[i/firstFactor] == 0) semiprime[i]=1;   
        }  
        return semiprime;
    }
}