def findRestaurant(list1, list2):
	min = float('inf')
	res = []
	for i, x in enumerate(list1):
		for j, y in enumerate(list2):
			if x == y:
				if min > i+j:
					res = [x]
				elif min == i+j:
					res.append(x)

	return res
