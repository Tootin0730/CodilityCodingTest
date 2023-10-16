class Solution {
    public int solution(int N) {
        int min = N;
        for(int a = 1; a < N+1; a++){
            int b = N/a;
            int perimeter = 2 * (a + b);
            if (min > perimeter){
                min = perimeter;
            }
        }
        return min;
    }
}