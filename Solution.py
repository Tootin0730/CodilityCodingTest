def solution(A):
    dic = {}
    equileader = 0
    leader_cnt = 0

    for i in A:
        if i in dic:
            dic[i] +=1
            if dic[i] > leader_cnt:
                leader_cnt = dic[i]
                leader = i
        else :
            dic[i]=1

    if leader_cnt<=len(A)/2:
        return 0

    left = 0
    right = leader_cnt
    
    for ix, i in enumerate(A):
        if i == leader:
            left+=1
            right-=1
        if left>(ix+1)/2 and right> (len(A)-ix-1)/2:
            equileader +=1
    return equileader