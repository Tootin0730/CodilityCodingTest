class Solution {

    public static int[] insertX(int n, int arr[], int x, int pos){
        int i;
        int newarr[] = new int[n + 1];
        for (i = 0; i < n + 1; i++) {
            if (i < pos - 1)
                newarr[i] = arr[i];
            else if (i == pos - 1)
                newarr[i] = x;
            else
                newarr[i] = arr[i - 1];
        }
        return newarr;
    }

    public int[] solution(int N, int[] A) {

        for(int i = 0; i < A.length; i++){
            if(0 <= A[i] && A[i] <= A.length){
                int x = N; 
                int pos = A[i];
                A = insertX(A.length, A, x, pos);
                N+=1;

            }else if(A[i] > A.length){
                for (i = 0; i < A.length; i++) {
                    A[i] = N;
                }
            }
        }
        return A;
    }
}