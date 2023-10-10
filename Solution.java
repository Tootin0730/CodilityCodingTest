function solution(A) {
    length = A.length
    if (A > 400000) return 0
    let lastStart = A[0]
    let lastMax = A[0]
    let diff = 0
    for (i=0; i < length; i++){
        if (A[i] < lastMax) lastMax = A[i]
        if (A[i] < lastStart) lastStart = A[i]
        if (A[i] > lastMax) {
            lastMax = A[i]
            if (lastMax - lastStart > diff) diff = lastMax - lastStart
        }
    }
    return diff > 0 ? diff : 0
}