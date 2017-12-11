package leetcode;
import java.util.*;
public class StrobogrammaticNumber {
	public boolean isStrobogrammatic(String num) {
		Map<Character, Character> m = new HashMap<Character, Character>();
		m.put('6', '9');
		m.put('2', '2');
		m.put('1', '1');
		m.put('5', '5');
		m.put('9', '6');
		m.put('0', '0');
		
		for(int i = 0, j = num.length() - 1; i <= j; i++, j--){
			if(!m.containsKey(num.charAt(i)) || num.charAt(j) != m.get(num.charAt(i)))
				return false;
			if(i == j){
				if(num.charAt(i) != m.get(num.charAt(i)))
					return false;
			}
		}
		return true;
    }
}
