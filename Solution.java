import java.util.*;

class Solution {
    public int[] solution(int[] A) {

        HashMap<Integer, Integer> map1 = new HashMap<>();
        
        for(int i=0; i< A.length; i++){
            if(map1.containsKey(A[i]) == false){
                map1.put(A[i], 1);
            }
            else{
                 map1.put(A[i], map1.get(A[i])+1 );
            }
        }
        
        HashMap<Integer, Integer> map2 = new HashMap<>();
        
        for( int n : map1.keySet() ){            
            int numDivisors =0;
            int sqrtN = (int)Math.sqrt(n);

            for(int i=1; i<=sqrtN; i++ ){
                if( n % i == 0){
                    int anotherDivisor = n/i; 
                    if(map1.containsKey(i) == true ){
                        numDivisors = numDivisors + map1.get(i);
                    }
                    if(anotherDivisor != i){
                        if(map1.containsKey(anotherDivisor) == true){
                            numDivisors = numDivisors + map1.get(anotherDivisor);
                        }
                    }
                }
            }
            int numNonDivisors = A.length - numDivisors;
            map2.put(n, numNonDivisors); 
        }
        int[] results = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            results[i] = map2.get(A[i]);
        }

        return results;
    }
}