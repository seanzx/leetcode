package leetcode;

import java.util.*;

public class GrayCode {
	public List<Integer> grayCode(int n) {
          List<Integer> l = new ArrayList<Integer>();
          for(int i = 0; i < 1<< n; i++){
        	  l.add(i^i>>1);
          }
          return l;
    }
}
