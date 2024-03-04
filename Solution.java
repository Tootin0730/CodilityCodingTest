import java.util.*;

class Solution {
    public int solution(int[] A) {
        Arrays.sort(A);
        int low = 0;
        int high = A.length - 1;

        if (A[0] >= 0) {
            return 2 * A[0];
        }
        
        if (A[high] <= 0) {
            return -2 * A[high];
        }

        int min = Integer.MAX_VALUE;
        int i = 0, j = 0;
        int sum = 0;

        while (low < high){
            sum = A[high] + A[low];
            if (Math.abs(sum) < min){
                min = Math.abs(sum);
                i = low;
                j = high;
            }
 
            if (min == 0) {
                break;
            }

            if (sum < 0) {
                low++;
            } else {
                high--;
            }
        }
        return min;
    }
}