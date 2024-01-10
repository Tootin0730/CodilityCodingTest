class Solution {
    public int solution(int[] A) {
        int N = A.length;
        int result = 0;
        int check = 0;

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(A[i] == A[j]){
                    check += 1;
                }
            }
            if(check == 1){
                result = A[i];
                break;
            }
            check = 0;
        }
        return result;
    }
}
