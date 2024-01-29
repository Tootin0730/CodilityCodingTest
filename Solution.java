import java.util.Stack;

class Solution {
    public int solution(String S) {
        Stack<Character> stack = new Stack<>();
        int n = S.length(), i;
        char c1, c2;
        for (i = 0; i < n; i++) {
            c1 = S.charAt(i);
            if (c1 == '(' || c1 == '[' || c1 == '{')
                stack.push(c1);
            else {
                if (stack.isEmpty())
                    return 0;
                c2 = stack.pop();
                switch (c2) {
                    case '(': c2 = ')'; break;
                    case '[': c2 = ']'; break;
                    case '{': c2 = '}';
                }
                if (c1 != c2)
                    return 0;
            }
        }
        return (stack.isEmpty()) ? 1 : 0;
    }
}