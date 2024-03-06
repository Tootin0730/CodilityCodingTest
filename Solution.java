class Solution {
    public int solution(int K, int[] A) {
        int add;
        int count = 0;
        int preMax = -1;
        for(int i = 0; i < A.length; i++){
            add = A[i];
            count = 1;
            for(int j = i+1; j < A.length; j++){
                if(add < K){
                    add += A[j];
                    count += 1;
                }else{
                    break;
                }
            }
            if(preMax < count){
                preMax = count;
            }
        }
        return preMax;
    }
}