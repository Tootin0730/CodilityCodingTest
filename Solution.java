class Solution {
    public int solution(String S) {
        int len = S.length();
        int open = 0;
        int end = 0;
        int result = 0;

        if(len == 0){
            result = 0;
        }

        for(int i = 0; i < len; i++){
            if(S.charAt(i) == '('){
                open += 1;
            }else if (S.charAt(i) == ')'){
                end += 1;
            }

            if(open == end){
                result = 1;
            }else{
                result = 0;
            }
        }
        return result;
    }
}
