from TreeNode import TreeNode


def findLeaves(root):
	ret = []
	def dfs(node):
		if not node:
			return 0
		depth = max(dfs(node.left),dfs(node.right))+1
		if len(ret)<depth:
			ret.append([])
		ret[depth-1].append(node.val)
		return depth
	dfs(root)
	return ret


root = TreeNode(1)
root.left = TreeNode(2)
root.right = TreeNode(3)
root.left.left = TreeNode(4)
root.left.right = TreeNode(5)

print(findLeaves(root))