class Solution {
    public int solution(int N) {

        int min = 100000000;
        int perimeter = 0;

        for (int i = 1; i < N; i++){
            if(N%i == 0){
                perimeter = 2 * (i + (N/i));
            }
            if(min > perimeter){
                min = perimeter;
            }
        }
        return min;
    }
}