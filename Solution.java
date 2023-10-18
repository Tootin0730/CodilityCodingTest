class Solution {
    public int solution(int[] A) {

        int peakNum = 0;
        int peakLocation [] = new int[A.length];

        for(int i = 1; i < A.length-1; i++){
            if (A[i] > A[i-1] && A[i] > A[i+1]){
                peakLocation[peakNum] = i;
                peakNum += 1;
            }
        }

        int n = 0;
        int last = 0;

        for ( n = 1 ; n < peakLocation.length-1; n++){
            if(peakLocation[n] != peakLocation[n+1] && peakLocation[n] != peakLocation[n-1]){
                last += 1;
            }
        }

        return last;
    }
}