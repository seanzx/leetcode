from TreeNode import TreeNode

def lasgestValue(root):
	res = []
	def dfs(root, depth):
		if not root:
			return 0
		if len(res) < depth:
			res.append(root.val)
		elif res[depth - 1] < root.val:
			res[depth-1] = root.val
		dfs(root.left, depth+1)
		dfs(root.right, depth+1)

	dfs(root, 1)
	return res