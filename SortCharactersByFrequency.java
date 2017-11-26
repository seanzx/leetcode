package leetcode;

import java.util.*;

public class SortCharactersByFrequency {
	public static String frequencySort(String s) {
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		int max = 0;
		for(int i = 0; i < s.length(); i++){
			if(!m.containsKey(s.charAt(i)))
				m.put(s.charAt(i), 1);
			else{
				m.put(s.charAt(i), m.get(s.charAt(i)) + 1);
			}
			max = Math.max(m.get(s.charAt(i)), max);
		}
		List<Character>[] array = new List[max+1];
		for(char key : m.keySet()){
			if(array[m.get(key)] == null)
				array[m.get(key)] = new ArrayList<Character>();
			array[m.get(key)].add(key);
		}
		StringBuilder result = new StringBuilder();
		for(int i = array.length-1; i > 0; i--){
			if(array[i] != null)
			for(int j = 0; j < array[i].size(); j++){
				for(int k = 0; k < i; k++)
					result.append(array[i].get(j));
			}
		}
		return result.toString();
    }
	public static void main(String[] args) {
		System.out.println(frequencySort("cccaaa"));
	}
}
