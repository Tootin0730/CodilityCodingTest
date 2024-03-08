def solution(A):
    A = [abs(item) for item in A]
    sumOfA = sum(A)

    numbers = {}
    for item in A:
        numbers[item] = numbers.get(item, 0) + 1

    possible = [-1] * (sumOfA // 2 + 1)
    possible[0] = 0

    for number in numbers: 
        for trying in range(sumOfA // 2 + 1):
            if possible[trying] >= 0:
                possible[trying] = numbers[number]
            elif trying >= number and possible[trying - number] > 0:
                possible[trying] = possible[trying - number] - 1

    for halfSum in range(sumOfA // 2, -1, -1):
        if possible[halfSum] >= 0:
            return sumOfA - halfSum - halfSum

    raise Exception("Should never be here!")
    return 0