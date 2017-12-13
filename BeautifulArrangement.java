package leetcode;

public class BeautifulArrangement {
	static int cnt = 0;
	public static int countArrangement(int N) {
		int[] flag = new int[N+1];
		arrange(N, 1, flag);
		return cnt;
    }
	
	public static void arrange(int N, int i, int[] flag){
		if(i == N+1){
			cnt++;
			return ;
		}
		for(int j = 1; j < N + 1; j++){
			if(flag[j] == 0){
				if(j % i == 0 || i % j == 0){
					flag[j] = 1;
					arrange(N, i+1, flag);
					flag[j] = 0;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println(countArrangement(3));
	}
}
