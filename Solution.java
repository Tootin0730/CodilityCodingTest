class Solution{
    public static int solution(int[] A) {
        int total = 0;
        int check = 0;
        for (int i = 0; i < A.length; i++){
            check = 0;
            for(int j = i; j < A.length; j++){
                if(A[i] == A[j]){
                    check += 1;
                }
            }
            if(check <= 1){
                total += 1;
            }
        }
        return total;
    }
}