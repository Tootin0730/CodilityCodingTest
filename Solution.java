class Solution {
    public int solution(int N) {
        int result = 0;
        for (int i=1; i<=(double)Math.sqrt(N); i++) {
            if(i==(double)Math.sqrt(N)) {
                result++;
            }else if(N % i == 0) {
                result = result + 2;
            }   

        }
        
        return result;
    }
}