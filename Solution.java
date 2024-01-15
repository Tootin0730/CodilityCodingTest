import java.util.ArrayList;
import java.util.List;

class Solution {

    public int solution(int X, int[] A) {
        int list[] = A;
        int sum = 0;
        int searchedValue = X;

        List<Integer> arrayList = new ArrayList<Integer>();

        for (int i = 0; i < list.length; i++) {

            if (list[i] <= searchedValue && !arrayList.contains(list[i])) {
                sum += list[i];
                arrayList.add(list[i]);
            }
            if (list[i] == searchedValue) {
                if (sum == searchedValue * (searchedValue + 1) / 2) {
                    return i;
                }
            }
        }
        return -1;
    }
}