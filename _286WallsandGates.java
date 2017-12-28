package leetcode;
import java.util.*;
public class _286WallsandGates {
	public void wallsAndGates(int[][] rooms) {
		 Queue<int[]> q = new LinkedList<>();
	        for(int i = 0; i < rooms.length; i++) {
	        		for(int j = 0; j < rooms[0].length; j++) {
	        			if(rooms[i][j] == 0) {
	        				q.add(new int[] {i, j});
	        			}
	        		}
	        }
	        int depth = 0;
	        int[][] dirs = new int[][] {{0,1},{1,0},{0,-1},{-1,0}};
	        while(!q.isEmpty()) {
	        		Queue<int[]> newQ = new LinkedList<>();
	        		while(!q.isEmpty()) {
		        		int[] cur = q.poll();
		        		if(rooms[cur[0]][cur[1]] == Integer.MAX_VALUE) {
		        			rooms[cur[0]][cur[1]] = depth; 
		        		}
		        		for(int[] dir : dirs) {
		        			int x = dir[0] + cur[0];
		        			int y = dir[1] + cur[1];
		        			if(x >= 0 && y >= 0 && x < rooms.length && y < rooms[0].length && rooms[x][y] == Integer.MAX_VALUE) {
		        				newQ.add(new int[] {x,y});
		        			}
		        		}
	        		}
	        		depth++;
	        		q = newQ;
	        }
    }
	
	public static void main(String[] args) {
		int[][] rooms = new int[][] {{2147483647,-1,0,2147483647},{2147483647,2147483647,2147483647,-1},{2147483647,-1,2147483647,-1},{0,-1,2147483647,2147483647}};
		_286WallsandGates s = new _286WallsandGates();
		s.wallsAndGates(rooms);
	}
}
