package leetcode;
import java.util.*;
public class _313SuperUglyNumber {
	public int nthSuperUglyNumber(int n, int[] primes) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        Set<Integer> s = new HashSet<>();
		q.add(1);
		int k = 0;
		int cur = 0;
		while(k < n && !q.isEmpty()) {
			cur = q.poll();
			if(!s.contains(cur)) {
				s.add(cur);
				System.out.println(k +"  "+ cur);
				k++;
				for(int i = 0; i < primes.length; i++) {
					if(Integer.MAX_VALUE / cur >= primes[i])
						q.add(cur * primes[i]);
				}
			}
		}
		return cur;
    }
	
	public static void main(String[] args) {
		_313SuperUglyNumber s = new _313SuperUglyNumber();
		s.nthSuperUglyNumber(100000,new int[]{7,19,29,37,41,47,53,59,61,79,83,89,101,103,109,127,131,137,139,157,167,179,181,199,211,229,233,239,241,251});
	}
}
