import java.util.*;
class Solution {
    public int solution(int[] A) {
     int i = 0;
     Arrays.sort(A);
     for (int temp : A) {
         if (A[i] != A[(i+1) % A.length]) {
             return A[i];
         }
         i += 2;
     }
     return A[A.length - 1];
    }
}