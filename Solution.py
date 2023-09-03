def solution(X, A):
    check = [False] * X
    sum = 0

    for sec, fall in enumerate(A):
        if(fall > X):
            continue

        if(not(check[fall-1])):
            check[fall-1] = True
            sum += 1
            if(sum == X):
                return sec
    return -1