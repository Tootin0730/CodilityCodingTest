def solution(A):
    _l = len(A)
    base = 0
    res = 0
    for i in range(_l):
        if A[i]==0:
            base+=1
        else:
            res+=base
        if res>1000000000: return -1
    return res