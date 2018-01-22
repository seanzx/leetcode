def isToeplitzMatrix(matrix):
	groups = {};
	for r, row in enumerate(matrix):
		for c, val in enumerate(row):
			if r-c not in groups:
				groups[r-c] = val;
			elif groups[r-c] != val:
				return False;
	return True;

def isToeplitzMatrix2(matrix):
	for r, row in enumerate(matrix):
		for c, val in enumerate(row):
			if(r-1 >= 0 and c-1 >= 0):
				if(matrix[r][c] != matrix[r-1][c-1]):
					return False;
	return True;


matrix = [[1,2],[2,2]]
print (isToeplitzMatrix2(matrix))