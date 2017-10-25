
package leetcode;

public class ContainerWithMostWater {
	public static int maxArea(int[] height) {
		int max = 0;
		int l = 0;
		int r = height.length - 1;
		while(l < r){
			max = Math.max(max, (r - l)*Math.min(height[l], height[r]));
			if(height[l] > height[r]){
				r--;
			}
			else
				l++;
		}
		
        return max;
    }
	public static void main(String[] args) {
		int[] height = {1,2,4,3};
		System.out.println(maxArea(height));
	}
}
