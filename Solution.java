class Solution {

    public int solution(int[] A) {
    
        int N = A.length;
        int[] counter = new int[N+1];
        int maxValue = 0;

        for (int i : A) {
            if (i < 1 || i > N)
                return 0;
            if (i > maxValue)
                maxValue = i;
            counter[i]++;
            if (counter[i] > 1)
                return 0;
        }
        
        if (maxValue != N)
            return 0;
        return 1;
    }
}