class Solution {
    public int solution(int[] A) {
        int n = A.length, size = 0, value = 0;

        for (int i = 0; i < n; i++){
            if (size == 0) {
                size++;
                value = A[i];
            } else {
                size += (value == A[i]) ? 1 : -1;
            }
        }

        if (size <= 0){
            return -1;
        }

        int leader = -1, counter = 0;
        for (int i = 0; i < n; i++){
            if (A[i] == value) {
                counter++;
                if (leader == -1){
                    leader = i;
                }
            }
        }
        
        return (counter > n / 2) ? leader : -1;
    }
}