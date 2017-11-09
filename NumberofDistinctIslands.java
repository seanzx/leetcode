package leetcode;

import java.util.*;
import java.util.List;

public class NumberofDistinctIslands {
	public static int numDistinctIslands(int[][] grid) {
		int r = grid.length;
		int c = grid[0].length;
		List<Integer> s = new ArrayList<Integer>();
        for(int i = 0; i < grid.length; i++){
        	for(int j = 0; j < grid[0].length; j++)
        		if(grid[i][j] == 1)
        			s.add(i*c + j);
        }
        Set<Integer>[] S = new HashSet[r*c];  
        while(!s.isEmpty()){
        	int x = s.remove(0);
        	List<Integer> s1 = new ArrayList<Integer>();
        	int x1 = 0;
        	if(grid[x/c][x%c] == 1){
        		s1.add(x);
        		x1 = x;
        		S[x1] = new HashSet<Integer>();  
        		S[x1].add(0);
        	}
        	while(!s1.isEmpty()){
        		x = s1.remove(0);
        		int r1 = x / c;
        		int c1 = x % c;
        		if(grid[r1][c1] == 1){	
	        		grid[r1][c1] = -1;
	        		if(r1 > 0 && grid[r1-1][c1] == 1){
	            		s1.add(x-c);
	            		S[x1].add(x-c-x1);
	            	}
	        		if(c1>0 && grid[r1][c1-1] == 1){
	            		s1.add(x-1);
	            		S[x1].add(x-1-x1);
	            	}
	        		if(r1<r-1 && grid[r1+1][c1] == 1){
	            		s1.add(x+c);
	            		S[x1].add(x+c-x1);
	            	}
	        		if(c1<c-1 && grid[r1][c1+1] == 1){
	            		s1.add(x+1);
	            		S[x1].add(x+1-x1);
	            	}
        		}
        	}	
        }
       
        int n = 0;
        
        for(int i = 0; i < S.length; i++){
        	if(S[i] != null){
        		n++;
	        	for(int j = i+1; j < S.length; j++){
	        		if(S[j] != null){
	        			if(S[i].equals(S[j])){
	        				n--;	
	        				break;	
	        			}
	        		}
	        	}
        	}
        }
        return n;
    }
	public static void main(String[] args) {
		int[][] grid ={{0}};
		System.out.println(numDistinctIslands(grid));
	}
}
