package leetcode;
import java.util.*;
public class KnightProbabilityinChessboard {
	public static double knightProbability(int N, int K, int r, int c) {
        double[][] dp = new double[N][N];
        dp[r][c] = 1;
        int[][] moves = {{1,2},{1,-2},{2,1},{2,-1},{-2,1},{-2,-1},{-1,2},{-1,-2}};
        for(int k = 1; k <= K; k++){
        	double[][] temp = new double[N][N];
        	for(int i = 0; i < N; i++){
        		for(int j = 0; j < N; j++){
        			for(int[] move : moves){
        				int x = i + move[0];
        				int y = j + move[1];
        				if(x<0 || x>=N || y<0 || y>=N){
        				}
        				else{
        					temp[x][y] += dp[i][j]; 
        				}
        			}
        		}
        	}
        	dp = temp; 
        }
        double ans = 0;
        for(int i = 0; i < N; i++){
        	for(int j = 0; j < N; j++){
        		ans += dp[i][j];
        	}
        }
        return (double)ans/(double)(Math.pow(8, K));
    }
	
	public static void main(String[] args) {
		System.out.println(knightProbability(8, 30, 6, 4));
	}
}
