class Solution {

    public final int solution(final int[] data) {

        final long N = data.length + 1;
        final long total = (N * (N + 1)) / 2;
        
        long sum = 0L;

        for (final int i : data) {

            sum += i;
        }

        return (int)(total - sum);
    }
}