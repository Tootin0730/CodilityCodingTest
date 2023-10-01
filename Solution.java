import java.util.Stack;

class Solution {
    public int solution(int[] A, int[] B) {
        Stack<Integer> liveFish = new Stack<>();
        for(int i = 0; i < A.length; i++) {
            if (liveFish.isEmpty())
                liveFish.push(i);
            else {
                while (!liveFish.isEmpty() && B[i]-B[liveFish.peek()] == -1 && A[liveFish.peek()] < A[i])
                    liveFish.pop();
                if (liveFish.isEmpty())
                    liveFish.push(i);
				else if (B[i] - B[liveFish.peek()] != -1)
                    liveFish.push(i);
            }
        }
        return liveFish.size();
    }
}