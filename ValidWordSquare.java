package leetcode;

import java.util.*;

public class ValidWordSquare {
	public static boolean validWordSquare(List<String> words) {
        for(int i = 0; i < words.size(); i++){
        	for(int j = 0; j < words.get(i).length(); j++){
        		if(words.size() < j+1 || words.get(j).length() < i+1)
        			return false;
        		if(words.get(i).charAt(j) != words.get(j).charAt(i))
        			return false;
        	}
        	
        }
        return true;
    }
	
	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("abc");
		l.add("b");
//		l.add("crm");
//		l.add("dt");
		System.out.println(validWordSquare(l));
	}
}

