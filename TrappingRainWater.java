package leetcode;

public class TrappingRainWater {
	public static int trap(int[] height) {
		int sum = 0;
		int maxleft = 0;
		int maxright = 0;
		for(int i = 1; i < height.length-1; i++){
			maxleft = 0;
			maxright = 0;
			for(int j = i-1;  j >= 0; j--){
				maxleft = Math.max(maxleft, height[j]);
			}
			for(int j = i+1;  j < height.length; j++){
				maxright = Math.max(maxright, height[j]);
			}
			sum = sum + Math.max(Math.min(maxright, maxleft) - height[i], 0);
		}
        return sum;
    }
	
	public static void main(String[] args) {
		int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(trap(height));
	}
}
