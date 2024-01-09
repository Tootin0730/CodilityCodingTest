class Solution {
    public int[] solution(int[] A, int K) {
        
        // Corner cases to save resources
         if(K == 0 || A.length <= 0 || A.length == K){
             return A;
         }
         
         // Loop to traverse K times
         for(int i=0; i<K; i++){
             int last = A[A.length - 1]; // Last digit
             
             // Loop to traverse A.Length times in swing order,
             // so that first element can be set
             for(int j=A.length-1; j>0; j--){
              A[j] = A[j-1];   
             }
             
             // Set last element
             A[0] = last;
         }
         
         // Return result
         return A;
    }
}
