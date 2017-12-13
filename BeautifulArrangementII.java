package leetcode;

public class BeautifulArrangementII {
	
	public static int[] constructArray(int n, int k) {
		int[] result = new int[n];
		for(int i = 1, j = k + 1, l = 0; i <= j;){
			result[l] = i;
			if(j != i)
				result[l+1] = j;
			i++;
			j--;
			l += 2;
		}	
		for(int i = k + 2; i <= n; i++){
			result[i-1] = i;
		}
		return result;
    }
	
	public static void main(String[] args) {
		System.out.println(constructArray(3, 2));
	}
}
