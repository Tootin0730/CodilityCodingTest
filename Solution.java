class Solution {
    public int solution(int[] A) {

        int result = 0;
        int zeroPosition = 0;
        int onePosition = 0;

        for(int i = 0; i < A.length; i++){
            if(A[i] == 0){
                zeroPosition += 1;
            } else if (A[i] == 1){
                onePosition += 1;
            }
        }

        int[] zero = new int[zeroPosition];
        int[] one = new int[onePosition];
        zeroPosition = 0;
        onePosition = 0;

        for(int i = 0; i < A.length; i++){
            if(A[i] == 0){
                zero[zeroPosition] = i;
                zeroPosition += 1;
            } else if (A[i] == 1){
                one[onePosition] = i;
                onePosition += 1;
            }
        }

        for(int a = 0; a < zero.length; a++){
            for (int b = 0; b < one.length; b++){
                if(zero[a] < one[b]){
                    result += 1;
                }
            }
        }


        return result;
    }
}