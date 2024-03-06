def solution(k,A):
    cnt = 0
    previousNotLenght=0
    for x in A:
        if x >=k:
            cnt+=1
            previousNotLenght=0
        elif previousNotLenght+x >=k:
            cnt+=1
            previousNotLenght = 0
        else:
            previousNotLenght+=x
    return cnt