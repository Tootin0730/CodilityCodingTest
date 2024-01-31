import java.util.ArrayList;

class Solution {
    public int solution(int[] H) {

        ArrayList<Integer> list = new ArrayList<>();
        int before = 0;
        int result = 0;

        for(int i = 0; i < H.length; i++){
            if(H[i] > before || H[i] < before){
                list.add(H[i]);
                before = H[i];
            } else if(list.contains(H[i]) || H[i] == before){
                list.remove(Integer.valueOf(H[i]));
            }
        }
        result = list.size();
        return result;
    }
}