package leetcode;
import java.util.*;

public class DistributeCandies {
	public static void main(String[] args) {
		int[] candies={1,1,1,2,2,2,3,3,3,4};
		Set<Integer> S = new HashSet<Integer>();
        for(int i = 0;i<candies.length;i++){
            S.add(candies[i]);
        }
        if(2*S.size()>candies.length){
        	System.out.println(candies.length/2);
        }
        System.out.println(S.size());
        System.out.println(S);
	}
}
