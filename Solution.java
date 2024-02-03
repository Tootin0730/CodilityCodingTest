class Solution {

    public int solution(int[] A) {
        int size = 0, n = A.length, value = 0;
        for (int i = 0; i < n; i++)
            if (size == 0) {
                size++;
                value = A[i];
            } else
				size += (A[i] == value) ? 1 : -1;
        if (size <= 0)
            return 0;
        int counter = 0, leader = 0;
        for (int i = 0; i < n; i++)
            if (A[i] == value)
                counter++;
        if (n - counter >= counter)
            return 0;
		else
			leader = value;

		int leaderInLeftPart = 0, result = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] == leader)
                leaderInLeftPart++;
            int leaderInRightPart = counter - leaderInLeftPart;
            if (leaderInLeftPart > (i+1)/2 && leaderInRightPart > (n-i-1)/2)
                result++;
        }
        return result;
    }
}