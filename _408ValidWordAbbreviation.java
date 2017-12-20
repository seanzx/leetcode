package leetcode;

public class _408ValidWordAbbreviation {
	public boolean validWordAbbreviation(String word, String abbr) {
        int i = 0;
        int j = 0;
		for(; i < word.length() && j < abbr.length();) {
			if(abbr.charAt(j) <= 'z' && abbr.charAt(j) >= 'a') {
				if(abbr.charAt(j) != word.charAt(i)) {
					return false;
				}else {
					i++;
					j++;
				}
			}else {
				int num = 0;
				if(abbr.charAt(i) == '0')
					return false;
				while(j < abbr.length() && Character.isDigit(abbr.charAt(j))) {
					num *= 10;
					num += abbr.charAt(j++) - '0'; 
				}
				i += num; 
			}
		}
		if(i == word.length() && j == abbr.length()) {
			return true;
		}else
			return false;
    }
	
	public static void main(String[] args) {
		_408ValidWordAbbreviation s = new _408ValidWordAbbreviation();
		s.validWordAbbreviation("a", "01");
	}
}
