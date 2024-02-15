import java.util.*;

class Solution {
    public int solution(int N, int M) {

        int answer =1;
        HashMap<Integer , Integer> som = new HashMap<>();
        boolean check = true;
        int x =0;
        som.put(0,0);
        while(check){
        int  m = (x+ M) % N ;
            x = m;
            if(som.containsKey(x)){
            check = false;
            }else{
                som.put(x,0);
                answer++;
            }
        }
        return answer;
    }
}