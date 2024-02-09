class Solution {
    public int solution(int[] A) {

        int[] peeks = new int[A.length/2]; 
        int position = 0;

        for (int i = 1; i < A.length -1; i++){
            if(A[i] > A[i-1] && A[i] > A[i+1]){
                peeks[position] = i;
                position += 1;
            }
        }

        int maxFlags = 0;
        for(int flags = 0; flags < peeks.length-1; flags++){
            if (peeks[flags + 1] - peeks[flags] >= flags){
                maxFlags += 1;
            }
        }

    return maxFlags;
    }
}