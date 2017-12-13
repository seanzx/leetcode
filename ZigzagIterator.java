package leetcode;
import java.util.*;
public class ZigzagIterator {
	int num = 0;
	List<Integer> v = new ArrayList<Integer>();
	public ZigzagIterator(List<Integer> v1, List<Integer> v2) {
		int i = 0;
		for(i = 0; i < Math.min(v1.size(), v2.size()); i++){
			v.add(v1.get(i));
			v.add(v2.get(i));
		}
		
		while(i < v1.size()){
			v.add(v1.get(i++));
		}
		while(i < v2.size()){
			v.add(v2.get(i++));
		}
    }

    public int next() {
        return v.get(num++);
    }

    public boolean hasNext() {
        if(num >= v.size())
        	return false;
        else
        	return true;
    }
}
