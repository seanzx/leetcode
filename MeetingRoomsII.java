package leetcode;

import java.util.*;;

public class MeetingRoomsII {
	public static int minMeeitngRoom(Interval[] interval){
		int[][] p = new int[interval.length*2 ][2];
		for(int i = 0; i < interval.length; i ++){
			p[i*2][0] = interval[i].start;
			p[i*2][1] = 0;
			p[i*2+1][0] = interval[i].end;
			p[i*2+1][1] = 1;
		}
		
		Arrays.sort(p, (a,b)-> (a[0]-b[0]<0) || a[0]-b[0]==0 && a[1]>b[1] ? -1:1);
		
		int max = 0;
		int sum = 0;
		for(int i = 0; i < p.length; i++){
			System.out.println(p[i][0]);
			if(p[i][1] == 0){
				sum++;
			}
			else
				sum--;
			max = Math.max(max, sum);
		}
		return max;
	}
	
	public static void main(String[] args) {
		Interval[] i = new Interval[3];
		i[0] = new Interval(0,30);
		i[1] = new Interval(5,10);
		i[2] = new Interval(10,20);
		minMeeitngRoom(i);
	}
}
