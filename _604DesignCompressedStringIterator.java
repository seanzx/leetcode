package leetcode;
import java.util.*;

public class _604DesignCompressedStringIterator {
	Queue<Integer> num = new LinkedList<>();
	Queue<Character> character = new LinkedList<>();
	char ch;
	int k = 0;
	public _604DesignCompressedStringIterator(String compressedString) {
		for(int i = 0; i < compressedString.length(); i++) {
			int x = 0;
			character.add(compressedString.charAt(i++));
			while(i < compressedString.length() && Character.isDigit(compressedString.charAt(i))) {
				x *= 10;
				x += compressedString.charAt(i++) - '0';
			}
			i--;
			num.add(x);
		}
		
    }
    
    public char next() {
    		if(k-- != 0) {
    			System.out.println(k);
    			return ch;
    		}else if(!num.isEmpty()){
    			ch = character.poll();
    			k = num.poll();
    			return ch;
    		}else {
    			return ' ';
    		}
    	
    }
    
    public boolean hasNext() {
    	if(k == 0 && num.isEmpty()) {
    			return false;
        }else
        	return true;
    }
    
    public static void main(String[] args) {
		_604DesignCompressedStringIterator s=  new _604DesignCompressedStringIterator("x3");
		s.next();
		s.next();
		s.next();
		s.next();
	}
}
