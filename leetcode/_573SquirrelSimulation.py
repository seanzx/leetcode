def mindistance(height, width, tree, squirrel, nuts):
	res = 0
	d = sys.minsize
	for i, x in enumerate(nuts):
		res += abs(nuts[i][0] - tree[0]) + abs(nuts[i][1] - tree[1])
		d = max(d, abs(nuts[i][0] - tree[0]) + abs(nuts[i][1] - tree[1]) -abs(nuts[i][0] - squirre[1]) + abs(nuts[i][1] - squirre[1]))
	return res - d


