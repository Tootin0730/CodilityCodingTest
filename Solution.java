class Solution {
    public int solution(int N) {
        int remainder = 0;
        int binary_gap = 0;
        int max_gap = 0;
        while (N > 0){
            remainder = N%2;
            N = N/2;

            if(remainder == 1){
                binary_gap = 0;
            }else if(remainder == 0){
                    binary_gap += 1;
                    if (max_gap < binary_gap){
                        max_gap = binary_gap;
                    }
                
            }
        }
        return max_gap;
    }
}