from TreeNode import TreeNode



def findBottomLeftValue(root):
	def dfs(root, depth):
		if not root:
			return 0
		if len(res) == 0:
			res.append(depth)
			res.append(root.val)
		elif res[0] < depth:
			res[0] = depth
			res[1] = root.val
		dfs(root.left, depth + 1)
		dfs(root.right, depth + 1)
	dfs(root, 0)


res = []
root = TreeNode(1)
root.left = TreeNode(2)
root.right = TreeNode(3)
root.left.left = TreeNode(4)
root.right.left = TreeNode(5)
root.right.right = TreeNode(6)
root.right.left.left = TreeNode(7)
findBottomLeftValue(root)

print(res)