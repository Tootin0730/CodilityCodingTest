import java.util.*;
public class solution {

class Solution {
    public int solution(int N) {
        String binary = Integer.toBinaryString(N);
	    int count=0;
	    ArrayList<Integer> lengths = new ArrayList<Integer>();
		
	        for(int i = 0;i<binary.length();i++){
	    	if(binary.charAt(i)=='1' && (i+1) < binary.length() && binary.charAt(i+1)=='0' ){
				count +=1;
				i++;
				while(binary.length() > (i+1) && binary.charAt(i+1) == '0' ){			
					count+=1;
					i++;
					if((i+1) < binary.length() && binary.charAt(i+1)=='1') {
						break;
					}
				}
				if(binary.length() > (i+1) && binary.charAt(i+1)=='1'){
					lengths.add(count);
					count =0;
				}
			}
		}   
	if(lengths.size()==0){
	    return 0;
	}else{
	    return Collections.max(lengths); 
    }
}
}
}
