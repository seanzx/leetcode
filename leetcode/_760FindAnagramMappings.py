def anagramMappings(A, B):
	D = {x : i for i, x in enumerate(B)}
	print (D);
	return [D[x] for x in A]

A = [12, 28, 46]
B = [46, 12, 28]
result = anagramMappings(A, B);
print (result);