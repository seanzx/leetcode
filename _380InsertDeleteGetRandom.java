package leetcode;
import java.util.*;
public class _380InsertDeleteGetRandom {
	Map<Integer, Integer> m1 = new HashMap<>();
	Map<Integer, Integer> m = new HashMap<>(); 
    /** Initialize your data structure here. */
    public _380InsertDeleteGetRandom() {
        
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        boolean contain = m1.containsKey(val);
        if(!contain) {
        		m1.put(val, m1.size());
        		m.put(m.size(), val);
        }
        return !contain;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        boolean contain = m1.containsKey(val);
        if(contain) {
        		int last = m.get(m.size()-1);
        		int loc = m1.get(val);
        		m.put(loc, last);
        		m.remove(m.size()-1);
        		m1.remove(val);
        		if(m1.containsKey(last))
        			m1.put(last, loc);
        }
        return contain;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
    		if(m.size() == 0)
    			return 0;
        Random x = new Random();
        int y = x.nextInt(m.size());
        if(!m.containsKey(y)) {
        		System.out.println(y + String.valueOf(m.containsKey(y)));
        }
        
        return m.get(y);
    }
}
