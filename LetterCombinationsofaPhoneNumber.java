package leetcode;

import java.util.*;
public class LetterCombinationsofaPhoneNumber {
	public static List<String> letterCombinations(String digits) {
		if(digits.length() == 0)
			return new ArrayList<String>();
        List<String> l = new ArrayList<String>();
		l.add("");
		l.add("abc");
		l.add("def");
		l.add("ghi");
		l.add("jkl");
		l.add("mno");
		l.add("pqrs");
		l.add("tuv");
		l.add("wxyz");
		List<String> l1 = new ArrayList<String>();
		List<String> l2 = new ArrayList<String>();
		String s = l.get((digits.charAt(0) - '0' - 1));
		for(int i = 0; i < s.length(); i++)
			l1.add("" + s.charAt(i));
		for(int i = 1; i < digits.length(); i++){
			while(!l1.isEmpty()){
				String temp = l1.remove(0);
				s = l.get((digits.charAt(i) - '0' - 1));
				for(int j = 0; j < s.length(); j++){
					l2.add(temp + s.charAt(j));
				}
			}
			l1.addAll(l2);
			l2.removeAll(l2);
		}
        return l1;
    }
	public static void main(String[] args) {
		System.out.println(letterCombinations("234"));
	}
}
