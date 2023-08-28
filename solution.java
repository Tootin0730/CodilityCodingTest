import java.util.*;

class Solution {

public int solution(int start, int end, int distance) {

    int progress = start;
    int count=0;
    
    while(progress<end) {
        progress=progress+distance;
        count++;
    }

    return count;
    }
}
