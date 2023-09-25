def solution(A):
    triangle_num = 0
    for a in range(len(A)):
        for b in range(a+1, len(A)):
            for c in range(b+1, len(A)):
                if A[a] < A[b] + A[c]:
                    if A[b] < A[a] + A[c]:
                        if A[c] < A[a] + A[b]:
                            triangle_num += 1
        
    return triangle_num