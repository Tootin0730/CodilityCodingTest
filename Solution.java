import java.util.*;
class Solution {
    
    public int solution(int N) {
        String binary = Integer.toBinaryString(N);
	    int count=0;          //keep count of zeros
	    ArrayList<Integer> lengths = new ArrayList<Integer>();	//stores binary gaps
	        for(int i = 0;i<binary.length();i++){
	            if(binary.charAt(i)=='1' && (i+1) < binary.length() && binary.charAt(i+1)=='0' ){    //search first encounter of 1 and only if subsequent charactor is 0 start counting the 0's
                count +=1;
                i++;
                while(binary.length() > (i+1) && binary.charAt(i+1) == '0' ){ //increment count if theres subsequent zeros			
                    count+=1;
                    i++;
                    if((i+1) < binary.length() && binary.charAt(i+1)=='1'){ //next index within range 
                        break;
                    }
                }
                if(binary.length() > (i+1) && binary.charAt(i+1)=='1') { //add to lengths only if ending with 1 
                    lengths.add(count);
                    count =0;         //initializing count
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