package leetcode;

public class TaskScheduler {
	public static int leastInterval(char[] tasks, int n){
        if(tasks.length == 0) return 0;
        if(n == 0) return tasks.length;
		int[] a = new int[26];  
		for(int i = 0; i<tasks.length; i++){
			a[tasks[i]-'A']++;
		}
		QuickSort(a);
		int num = 0;
		while(a[0]!=0){
			int i =0;
			while(i<Math.min(a.length, n+1)&&a[i]!=0){
				a[i]--;
				i++;
			}
			if(a[0]!=0){
				num += n-i+1;
			}
			QuickSort(a);
		}
		return num+tasks.length;
	}
	
	public static void main(String[] args) {
		char[] tasks ={'A','B','C','D','E','A','B','C','D'};
		System.out.println(leastInterval(tasks, 3));
	}
	public static void QuickSort(int[] a){
		Sort(a, 0 ,a.length);
	}
	
	public static void Sort(int[] a, int left, int right){
		if(left >= right) return;
		int x = a[left];
		int j = left;
		int temp = 0;
		for(int i = left+1; i < right; i++){
			if(a[i] >= x){
				j++;
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		a[left] = a[j];
		a[j] = x;
		Sort(a, left, j);
		Sort(a, j+1, right);
	}
	
}
