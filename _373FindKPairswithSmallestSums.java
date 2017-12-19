package leetcode;
import java.util.*;
public class _373FindKPairswithSmallestSums {
	public List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
		if(nums2.length == 0)
			return new ArrayList<>();
		PriorityQueue<int[]>	 q = new PriorityQueue<>((a, b) -> a[0] + a[1] - b[0] -b[1]);	
		List<int[]> l = new ArrayList<>();
		for(int i = 0; i < nums1.length && i < k; i++) {
			q.add(new int[] {nums1[i], nums2[0], 0});			
		}
		
		while(!q.isEmpty()) {
			int[] cur = q.poll();
			l.add(new int[] {cur[0], cur[1]});
			if(cur[2] == nums2.length - 1) continue;
			q.add(new int[] {cur[0], nums2[cur[2]+1], cur[2]+1});
		}
		return l;
    }
	
	public static void main(String[] args) {
		int[] nums1 = new int[] {-10,-4,0,0,6};
		int[] nums2 = new int[] {3,5,6,7,8,100};
		_373FindKPairswithSmallestSums s = new _373FindKPairswithSmallestSums();
		s.kSmallestPairs(nums1, nums2, 10);
	}
}
