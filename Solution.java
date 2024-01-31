import java.util.Stack;

class Solution {
    public int solution(int[] H) {
        Stack<Integer> blocks = new Stack<>();
        int blockCounter = 0;
        for (int i = 0; i < H.length; i++) {
            while (!blocks.isEmpty() && blocks.peek() > H[i])
                blocks.pop();
            if (blocks.isEmpty() || blocks.peek() < H[i]) {
                blockCounter++;
                blocks.push(H[i]);
            }
        }
        return blockCounter;
    }
}