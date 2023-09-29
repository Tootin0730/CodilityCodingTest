import java.util.Stack;

class Solution {
   public int solution(String s) {

        if (s.length() % 2 != 0) {
            return 0;
        }

        Character openingBrace = new Character('{');
        Character openingBracket = new Character('[');
        Character openingParen = new Character('(');
        Stack<Character> openingStack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == openingBrace || c == openingBracket || c == openingParen) {
                openingStack.push(c);
            } else  {
                if (i == s.length()-1 && openingStack.size() != 1) {
                    return 0;
                }
                if (openingStack.isEmpty()) {
                    return 0;
                }
                Character openingCharacter = openingStack.pop();
                switch (c) {
                case '}':
                    if (!openingCharacter.equals(openingBrace)) {
                        return 0;
                    }
                    break;
                case ']':
                    if (!openingCharacter.equals(openingBracket)) {
                        return 0;
                    }
                    break;
                case ')':
                    if (!openingCharacter.equals(openingParen)) {
                        return 0;
                    }
                    break;

                default:
                    break;
                }
            } 
        }

        return 1;

    }
}