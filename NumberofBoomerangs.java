package leetcode;
import java.util.*;
public class NumberofBoomerangs {
	public static int numberOfBoomerangs(int[][] points) {
		int sum = 0;
		for(int i = 0; i < points.length; i++){
			 Map<Integer, Integer> m = new HashMap<>();
			for(int j = 0; j < points.length; j++){
				int d = (points[i][0]-points[j][0])*(points[i][0]-points[j][0])+(points[i][1]-points[j][1])*(points[i][1]-points[j][1]);
				if(m.containsKey(d)){
					m.put(d, m.get(d)+1);
				}
				else
					m.put(d, 1);
			}
			for(int x : m.keySet()){
				
				int y = m.get(x);
				if(y >= 2){
					sum += y*(y-1);
				}
			}
		}
		return sum;
    }
}
