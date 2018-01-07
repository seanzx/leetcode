package leetcode;
import java.util.*;
public class _57InsertInterval {
	public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
		
        int i = 0;
        while(i < intervals.size() && intervals.get(i).end < newInterval.start) {
        		i++;
        }
        if(i == intervals.size()) {
        		intervals.add(newInterval);
        }else {
        		while(i < intervals.size() && intervals.get(i).start <= newInterval.end) {
        			newInterval.end = Math.max(newInterval.end, intervals.get(i).end);
        			newInterval.start = Math.min(newInterval.start, intervals.get(i).start);
        			intervals.remove(i);
        		}
        		intervals.add(i, newInterval);
        }
        return intervals;
    }
}
