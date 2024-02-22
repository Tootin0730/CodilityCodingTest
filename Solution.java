import java.util.Arrays;

class Solution {
    public int solution(int[] A, int[] B, int[] C) {
        int N = A.length;
        int M = C.length;
        
        int[][] sortedNail = new int[M][2];
        for (int i = 0; i < M; i++) {
            sortedNail[i][0] = C[i];
            sortedNail[i][1] = i;
        }
        Arrays.sort(sortedNail, (int x[], int y[]) -> x[0] - y[0]);
        int result = 0;
        for (int i = 0; i < N; i++) {
            result = getMinIndex(A[i], B[i], sortedNail, result);
            if (result == -1)
                return -1;
        }
        return result + 1;
    }
    
    public int getMinIndex(int startPlank, int endPlank, int[][] nail, int preIndex) {
        int min = 0;
        int max = nail.length - 1;
        int minIndex = -1;
        while (min <= max) {
            int mid = (min + max) / 2;
            if (nail[mid][0] < startPlank)
                min = mid + 1;
            else if (nail[mid][0] > endPlank)
                max = mid - 1;
            else {
                max = mid - 1;
                minIndex = mid;
            }
        }
        if (minIndex == -1)
            return -1;
        int minIndexOrigin = nail[minIndex][1];
        
        for (int i = minIndex; i < nail.length; i++) {
            if (nail[i][0] > endPlank)
                break;
            minIndexOrigin = Math.min(minIndexOrigin, nail[i][1]);
            if (minIndexOrigin <= preIndex)
                return preIndex;
        } 
        return minIndexOrigin;
    }
}