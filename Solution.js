function solution(A) {
    let set = new Set();
    let max = 1;
    let min = 1;
    let n = A.length

    for (let i = 0; i < n; i += 1) {
        let num = A[i];
        if (num > max) {
            max = num;
        } else if (num < min) {
            min = num;
        }
        set.add(num)
    }
    
    let m = set.size
    let range = (max - min) + 1

    return n === m && range === m ? 1 : 0 
}