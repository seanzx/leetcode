def countPrimeSetBits(L, R):
	res = 0
	for i in range(L, R+1):
		if(isPrimes(bin(i).count('1'))):
			res += 1
	return res



def isPrimes(N):
	if(N == 1):
		return False
	for i in range(2, N):
		if(N % i == 0):
			return False
	return True

print(countPrimeSetBits(6,10)) 