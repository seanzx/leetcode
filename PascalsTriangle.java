package leetcode;
import java.util.*;

public class PascalsTriangle {
	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> l = new ArrayList<List<Integer>>();
		for(int i = 0; i < numRows; i++){
			List<Integer> l1 = new ArrayList<Integer>();
			if(i == 0){
				l1.add(1);
				l.add(l1);
			}
			else{
				l1.add(1);
				for(int j = 1; j < i; j++){
					l1.add(l.get(i-1).get(j-1) + l.get(i-1).get(j));
				}
				l1.add(1);
				l.add(l1);
			}
		}
		return l;
    }
	public static void main(String[] args) {
		System.out.println(generate(5));
	}
}
