class Solution {
    public int solution(String S) {
        
        int check1 = 0;
        int check2 = 0;
        int check3 = 0;
        int s = S.length();
        for(int i = 0; i < s; i++){
            if(S.charAt(i) == '('){
                check1 += 1;
            } else if(S.charAt(i) == ')') {
                check1 -= 1;
            } else if(S.charAt(i) == '{') {
                check2 += 1;
            } else if(S.charAt(i) == '}') {
                check2 -= 1;
            } else if(S.charAt(i) == '[') {
                check3 += 1;
            } else if(S.charAt(i) == ']') {
                check3 -= 1;
            }
        }

        int check4 = 0;
        for(int j = 0; j < s; j++){
            if(S.charAt(j) == '('){
                check4 += 1;
                if(S.charAt(j+1) == ')'){
                    check4 -= 1;
                }
            }
        }

        if(check1 == 0 && check2 == 0 && check3 == 0 && check4 == 0){
            return 1;
        }else{
            return 0;
        }



    }
}