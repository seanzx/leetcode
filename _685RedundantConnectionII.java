package leetcode;
import java.util.*;
public class _685RedundantConnectionII {
	public int[] findRedundantDirectedConnection(int[][] edges) {
        int[] parents = new int[edges.length + 1];
        List<int[]> redundant = new ArrayList<>();;
        
        for(int[] edge : edges) {
        		if(parents[edge[1]] == 0) {
        			parents[edge[1]] = edge[0];
        		}else {
        			redundant.add(new int[] {parents[edge[1]], edge[1]});
        			redundant.add(new int[] {edge[0], edge[1]});
        			edge[1] = 0;
        		}
        }
        
        for(int i = 1; i <= edges.length; i++) {
        		parents[i] = i;
        }
        
        for(int i = 0; i < edges.length; i++) {
        		if(edges[i][1] == 0) {
        			continue;
        		}
        	
        		int child = edges[i][1];
        		int father = edges[i][0];
        		if(find(parents, child) == find(parents, father)) {
        			if(!redundant.isEmpty()) {
        				return redundant.get(0);
        			}
        			else 
        				return edges[i];
        		}
        		parents[child] = find(parents, father);
        }
        return redundant.get(1);

    }
	
	public int find(int[] parents, int x) {
		if(x != parents[x]) {
			parents[x] = find(parents, parents[x]);
		}
		return parents[x];
	}
	
	public static void main(String[] args) {
		int[][] edges = new int[][] {{1,2},{2,3},{3,4},{4,1},{1,5}};
		_685RedundantConnectionII s = new _685RedundantConnectionII();
		s.findRedundantDirectedConnection(edges);
	}
}
