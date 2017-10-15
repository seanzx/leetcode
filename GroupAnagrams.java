package leetcode;

import java.util.*;
public class GroupAnagrams {
	public static List<List<String>> groupAnagrams(String[] strs) {
		int[] x = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,91,101};
		List<List<String>> s = new ArrayList<>();
		Map<Long, Integer> map = new HashMap<>();
		long[] numOfLetter = new long[strs.length];
		for(int i = 0; i < strs.length ; i++){
			numOfLetter[i] = 1;
			
		}
		for(int i = 0; i < strs.length ; i++){
			for(int j = 0; j < strs[i].length(); j++){
				numOfLetter[i] *= x[strs[i].charAt(j) - 'a']; 
			}
		}
		
		for(int i = 0; i < strs.length; i++){
			if(!map.containsKey(numOfLetter[i])){
				map.put(numOfLetter[i], s.size());
				List<String> temp = new ArrayList<>();
				temp.add(strs[i]);
				s.add(temp);
			}
			else{
				int index = map.get(numOfLetter[i]);
				s.get(index).add(strs[i]);
			}
			
		}
		return s;
    }
	
	public static void main(String[] args) {
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		System.out.println(groupAnagrams(strs));
		
	}
}
