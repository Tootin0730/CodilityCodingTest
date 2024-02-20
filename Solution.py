def solution(A, B):
	limit = len(A)
	result = [0] * len(A)
	B = [(1 << item) - 1 for item in B]

	fib = [0] * (limit + 2)
	fib[1] = 1
	for i in range(2, limit + 2):
		fib[i] = fib[i - 1] + fib[i - 2]

	for i in range(limit):
		result[i] = fib[A[i] + 1] & B[i]

	return result