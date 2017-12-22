package leetcode;
import java.util.*;
public class _207CourseSchedule {
	public boolean canFinish(int numCourses, int[][] prerequisites) {
		int[] indegree = new int[numCourses]; 
		for(int[] pre : prerequisites) {
			indegree[pre[1]]++;
		}
		Queue<Integer> noPre = new LinkedList<>();
		for(int i = 0; i < numCourses; i++) {
			if(indegree[i] == 0)
				noPre.add(i);
		}
		int cnt = 0;
		while(!noPre.isEmpty()) {
			int cur = noPre.poll();
			cnt ++;
			for(int[] pre : prerequisites) {
				if(pre[0] == cur) {
					indegree[pre[1]]--;
					if(indegree[pre[1]] == 0) {
						noPre.add(pre[1]);
					}
				}	
			}
		}
		return cnt == numCourses ? true : false;
    }
	
	public static void main(String[] args) {
		_207CourseSchedule s= new _207CourseSchedule();
		s.canFinish(2, new int[][] {{1,0}});
	}
}
