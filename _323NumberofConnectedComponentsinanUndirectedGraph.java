package leetcode;

public class _323NumberofConnectedComponentsinanUndirectedGraph {
	int[] parents;
	public int countComponents(int n, int[][] edges) {
        parents = new int[n];
        
        for(int i = 0; i < n; i++) {
        		parents[i] = i;
        }
		
        int num = n;
        for(int[] edge : edges) {
        		if(find(edge[0]) != find(edge[1])) {
        			num--;
        			parents[find(edge[0])] = parents[edge[1]];
        		}
        }
        return num;
    }
	
	public int find(int x) {
		if(x != parents[x]) {
			parents[x] = find(parents[x]);
		}
		return parents[x];
	}
	
	public static void main(String[] args) {
		_323NumberofConnectedComponentsinanUndirectedGraph s = new _323NumberofConnectedComponentsinanUndirectedGraph();
		int[][] edges = new int[][] {{0,1},{0,2},{1,2},{2,3},{2,4}};
		s.countComponents(5, edges);
	}
}
