import java.util.Set;
import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] A) {
        Set<Integer> set = Arrays.stream(A).boxed().collect(Collectors.toSet());
        return set.size();
    }
}