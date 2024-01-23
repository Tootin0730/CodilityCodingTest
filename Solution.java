class Solution {
    public int solution(int[] A) {

        int min = 100;
        int result = 0;
        int avg = 100;
    
        for(int i = 0; i < A.length; i++){
            int sum = A[i];

            for(int j = i+1; j < A.length-1; j++){
                sum += A[j];    
                avg = (sum) / (j-i+1);

                if(avg < min){
                    min = avg;
                    result = i;
                    break;
                }
            }
        }
        return result;
    }
}