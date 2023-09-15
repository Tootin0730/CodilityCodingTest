function solution(A, B, K) {
    sum = 0;
    for(i = A; i < B; i++){
        if(i%K ==0 ){
            sum += 1
        }
    }
    return sum
}