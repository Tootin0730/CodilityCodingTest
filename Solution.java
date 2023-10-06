import java.util.*;
class Solution {
  public int solution(int[] A) {
    Map<Integer, Integer> D = new HashMap<Integer, Integer>();
    for (int a : A) {
      if (D.containsKey(a)) {
        D.put(a, D.get(a) + 1);
      } else {
        D.put(a, 1);
      }
    }
    int n = A.length; 
    for (Map.Entry<Integer, Integer> d : D.entrySet()) {
      if (d.getValue() > n / 2) {
        for (int i = 0; i < n; i++) {
          if (A[i] == d.getKey()) {
            return i;
          }
        }
      }
    }
    return -1;
  }
}  