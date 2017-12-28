package leetcode;
import java.util.*;
public class _247StrobogrammaticNumberII {
	public List<String> findStrobogrammatic(int n) {
		List<String> res;
        if(n % 2 == 1) {
        		res = Arrays.asList("1","0","8");
        }else {
        		res = Arrays.asList("");
        }
		for(int i = 0; i < n/2; i++) {
			List<String> copy = new ArrayList<>();
			for(String s : res) {
				copy.add("1" + s + "1");
				copy.add("8" + s + "8");
				copy.add("6" + s + "9");
				copy.add("9" + s + "6");
				if(i != n/2 - 1) {
					copy.add("0" + s + "0");
				}
			}
			res = copy;
		}
		return res;
    }
}
