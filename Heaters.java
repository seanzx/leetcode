package leetcode;
import java.util.*;
public class Heaters {
	public int findRadius(int[] houses, int[] heaters) {
		Arrays.sort(houses);
		Arrays.sort(heaters);
		int min = 0;
		for(int i = 0, j = 0; i < houses.length; i++){
			while(j < heaters.length && heaters[j] < houses[i])
				j++;
			if(heaters.length == j){
				min = Math.max(min, houses[i] - heaters[j-1]);
			}else if(j == 0){
				min = Math.max(min, heaters[j] - houses[i]);
			}else
				min = Math.max(min, Math.min(heaters[j] - houses[i], houses[i] - heaters[j-1]));
		}
		return min;
    }
}
